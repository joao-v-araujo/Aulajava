package service;

import model.Conta;

import java.util.ArrayList;

public class BancoService {
    private final ArrayList<Conta> contas = new ArrayList<>();
    private int proximoNumero = 1001;

    public Conta criarConta(String titular) {
        Conta conta = new Conta(proximoNumero, titular);
        contas.add(conta);
        proximoNumero++;
        return conta;
    }

    public Conta buscarConta(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    public boolean depositar(int numero, double valor) {
        Conta conta = buscarConta(numero);
        if (conta == null || !Double.isFinite(valor)
                || valor <= 0) {
            return false;
        }
        conta.depositar(valor);
        return true;
    }

    public boolean sacar(int numero, double valor) {
        Conta conta = buscarConta(numero);
        if (conta == null || !Double.isFinite(valor)
                || valor <= 0) {
            return false;
        }
        if (conta.getSaldo() < valor) {
            return false;
        }
        conta.sacar(valor);
        return true;
    }

    public boolean transferir(int origem, int destino, double valor) {
        Conta contaOrigem = buscarConta(origem);
        Conta contaDestino = buscarConta(destino);
        if (contaOrigem == null || contaDestino == null
                || origem == destino || !Double.isFinite(valor)
                || valor <= 0) {
            return false;
        }
        if (contaOrigem.getSaldo() < valor) {
            return false;
        }
        contaOrigem.sacar(valor);
        contaDestino.depositar(valor);
        return true;
    }

    public ArrayList<Conta> listarContas() {
        return new ArrayList<>(contas);
    }
}
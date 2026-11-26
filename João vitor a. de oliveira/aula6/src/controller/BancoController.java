package controller;

import model.Conta;
import service.BancoService;

import java.util.ArrayList;

public class BancoController {
    private final BancoService service = new BancoService();

    public Conta criarConta(String titular) {
        return service.criarConta(titular);
    }

    public Conta consultarConta(int numero) {
        return service.buscarConta(numero);
    }

    public boolean depositar(int numero, double valor) {
        return service.depositar(numero, valor);
    }

    public boolean sacar(int numero, double valor) {
        return service.sacar(numero, valor);
    }

    public boolean transferir(int origem, int destino, double valor) {
        return service.transferir(origem, destino, valor);
    }

    public ArrayList<Conta> listarContas() {
        return service.listarContas();
    }
}
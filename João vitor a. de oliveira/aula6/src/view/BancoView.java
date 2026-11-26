package view;

import controller.BancoController;
import model.Conta;

import java.util.Scanner;

public class BancoView {
    private final BancoController controller = new BancoController();
    private final Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        int opcao;
        do {
            mostrarMenu();
            opcao = lerInteiro("Escolha: ");
            switch (opcao) {
                case 1 -> criarConta();
                case 2 -> consultarSaldo();
                case 3 -> depositar();
                case 4 -> sacar();
                case 5 -> transferir();
                case 6 -> listarContas();
                case 0 -> System.out.println("Até logo!");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void mostrarMenu() {
        System.out.println("\n=== BANCO TECH ===");
        System.out.println("1 - Criar conta");
        System.out.println("2 - Consultar saldo");
        System.out.println("3 - Depositar");
        System.out.println("4 - Sacar");
        System.out.println("5 - Transferir");
        System.out.println("6 - Listar contas");
        System.out.println("0 - Sair");
    }

    private int lerInteiro(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite um número inteiro!");
            }
        }
    }

    private double lerValor(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                String texto = scanner.nextLine().replace(",", ".");
                return Double.parseDouble(texto);
            } catch (NumberFormatException e) {
                System.out.println("Digite um valor válido!");
            }
        }
    }

    private void criarConta() {
        System.out.print("Nome do titular: ");
        String nome = scanner.nextLine();
        if (nome.isBlank()) {
            System.out.println("Nome não pode ser vazio!");
            return;
        }
        Conta conta = controller.criarConta(nome);
        System.out.println("Conta criada: " + conta.getNumero());
    }

    private void consultarSaldo() {
        int numero = lerInteiro("Número da conta: ");
        Conta conta = controller.consultarConta(numero);
        if (conta == null) {
            System.out.println("Conta não encontrada!");
            return;
        }
        System.out.println("Titular: " + conta.getTitular());
        System.out.printf("Saldo: R$ %.2f%n", conta.getSaldo());
    }

    private void depositar() {
        int numero = lerInteiro("Número da conta: ");
        double valor = lerValor("Valor do depósito: ");
        if (controller.depositar(numero, valor)) {
            System.out.println("Depósito realizado!");
        } else {
            System.out.println("Depósito não permitido!");
        }
    }

    private void sacar() {
        int numero = lerInteiro("Número da conta: ");
        double valor = lerValor("Valor do saque: ");
        if (controller.sacar(numero, valor)) {
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saque não permitido!");
        }
    }

    private void transferir() {
        int origem = lerInteiro("Conta de origem: ");
        int destino = lerInteiro("Conta de destino: ");
        double valor = lerValor("Valor da transferência: ");
        if (controller.transferir(origem, destino, valor)) {
            System.out.println("Transferência realizada!");
        } else {
            System.out.println("Transferência não permitida!");
        }
    }

    private void listarContas() {
        System.out.println("\n=== CONTAS ===");
        for (Conta conta : controller.listarContas()) {
            System.out.printf("%d - %s - R$ %.2f%n",
                    conta.getNumero(),
                    conta.getTitular(),
                    conta.getSaldo());
        }
    }
}
package cap5lab1;

public class Cap5_Lab1 {
    static void main(String[] args) {

        Funcionario func = new Funcionario();

        func.nome = "joão Vitor";
        func.sobrenome = "Araújo";
        func.cargo = "Programador";
        func.salario = 50000;

        System.out.println("nome: " + func.nome);
        System.out.println("sobrenome: " + func.sobrenome);
        System.out.println("cargo: " + func.cargo);
        System.out.println("salario: " + func.salario);

    }
}

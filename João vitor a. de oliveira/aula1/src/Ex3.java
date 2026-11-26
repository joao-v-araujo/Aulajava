import java.util.Scanner;

public class Ex3 {
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int nascimento = sc.nextInt();

        int ano_atual = 2026;

        System.out.println( "minha idade atual é " + (ano_atual - nascimento));
    }
}

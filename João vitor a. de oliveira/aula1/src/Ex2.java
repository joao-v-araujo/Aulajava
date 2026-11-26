import java.util.Scanner;
public class Ex2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero 1: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo numero 2: ");
        int num2 = sc.nextInt();

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 / num2);
        System.out.println(num1 * num2);

    }
}
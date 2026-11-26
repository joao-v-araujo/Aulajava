import java.util.Scanner;
public class NumerosEOperadores {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        int numero1 = 15;
        int numero2 = 20;

        System.out.print("Digite o primeiro numero");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo numero");
        int num2 = sc.nextInt();

        /*
        System.out.println( numero1 + numero2 );
        System.out.println( numero1 - numero2 );
        System.out.println( numero1 / numero2 );
        System.out.println( numero1 * numero2 );
        */

        System.out.println(num1);
        System.out.println(num2);

        //Concatenação de Strings
        System.out.println("O primeiro numero foi: " + num1);
        System.out.println("O segundo numero foi: " + num2);

    }
}

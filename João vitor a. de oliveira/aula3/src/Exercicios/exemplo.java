package Exercicios;
import java.util.Scanner;

public class exemplo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limite = sc.nextInt();

        for ( int i = 0; i < limite; i++ )
        {
            System.out.println( "O seu valor é: " + i );
        }
    }
}

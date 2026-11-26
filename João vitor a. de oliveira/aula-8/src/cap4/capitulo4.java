package cap4;

import java.util.Scanner;

public class capitulo4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = 10;
        int divisor = 0;

        for (int i = 1; i <= valor; i++) {
            if (valor % i == 0) divisor++;
        }

        System.out.println(divisor == 2 ? "Primo" : "Não é primo");

    }
}

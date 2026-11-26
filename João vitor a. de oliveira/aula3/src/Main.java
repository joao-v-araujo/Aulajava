import java.sql.SQLOutput;

public class Main {
    public static void main(String[]  args) {

       for (int i = 1; i <= 10; i++)
        {
            System.out.println( "7 x " + i + " = " + 7 * i);
        }

       int i = 1, soma = 0;
       while ( i <= 5)
       {
           System.out.println( i );
           soma += i;
           i++;
       }
        System.out.println("Soma: " + soma);
    }
}

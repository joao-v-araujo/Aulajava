import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        System.out.println("aula 2 - Operadores");

        /*Criando variaveis
        int num1 = 5;
        int num2 = 10;

        if ( num1 > num2 ){
            System.out.println(" Maior ");
        }
        else {
            System.out.println(" Menor ");
        }*/

         //Verificando as notas de alunos
        double nota = 7.5;

        if ( nota > 7 ){
            System.out.println(" Aprovado ");
        } else if ( nota > 5 ) {
            System.out.println(" Recuperação ");
        }else {
            System.out.println(" Reprovado ");
        }
    }
}

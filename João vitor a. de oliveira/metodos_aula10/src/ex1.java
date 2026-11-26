public class ex1 {
    static void main() {
        soma(10, 10);
        multiplicacao(5, 5);
        subtrair( 10, 5);
        divisao( 15, 2);
    }
    //criar um metodo de contas basicas
    static void soma( int a, int b){
        System.out.println( a + b);
    }

    static void multiplicacao(int a, int b) {
        System.out.println( a * b );
        //pode ser usado como static int multiplicacao
        //return a + b;
    }

    static void subtrair(int a, int b) {
        System.out.println( a - b );
    }

    static void divisao( int a, int b) {
        System.out.println( a / b );
    }

}

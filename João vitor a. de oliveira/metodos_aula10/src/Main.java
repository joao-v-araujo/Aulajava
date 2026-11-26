public class Main {
    static void main() {
        saudacao("João");
        saudacao("Vitor");
        somar(10,20);
    }

    static void saudacao(String nome) {
        System.out.println("Boa noite " + nome);
    }
static void somar(int a, int b){
    System.out.println( a + b );
    if (a > b){
        System.out.println("a primeira opção é maior");
    }else {
        System.out.println("menor");
    }
}


}

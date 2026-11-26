public class ex2 {
    static void main() {
        calcularmedia( 10, 5, 7);
        int n1 = 10;
        int dobraCarai = dobrar(n1);
        System.out.println(dobrar(10));
        mensagem();
        System.out.println(mensagem());

    }
    //crie uma função qur calcule a media de 3 notas
    static double calcularmedia(int a, int b, int c){
        double media = (a + b + c) / 3;
        System.out.println(media);
        return media;
    }
    //criar uma função do tipo inteira DOBRAR e quando receber um numero, você dobra.
    static int dobrar(int x){
       return x * 2;
    }
    //criar uma função do tipo string mensagem, retornar feliz natal.

    static String mensagem(){
        return "feliz natal";
    }
}

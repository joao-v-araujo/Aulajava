package cap4;

public class capitulo4_3 {
    public static void main(String[] args) {

        for (int ano = 1930; ano <= 2026; ano += 4) {

            if (ano == 1942 || ano == 1946) {
                continue;
            }

            System.out.println("Copa do mundo de " + ano + "!");
        }
    }
}

package cap4;

public class capitulo4_2 {
    public static void main(String[] args) {
        String mes = "Novembro";

        switch (mes) {
            case "Janeiro":
            case "Março":
            case "Maio":
            case "Julho":
            case "Agosto":
            case "Outubro":
            case "Dezembro":
                System.out.println("O mês escolhido tem 31 dias");
                break;

            case "Abril":
            case "Junho":
            case "Setembro":
            case "Novembro":
                System.out.println("O mês escolhido tem 30 dias");
                break;

            case "Fevereiro":
                System.out.println("O mês escolhido tem 28 dias");
                break;

            default:
                System.out.println("Mês inválido!");
                break;
        }
    }
}

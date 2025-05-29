import java.util.Scanner;

public class ValidadorCartao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do cartão de crédito: ");
        String numero = scanner.nextLine().replaceAll("\\s+", "");

        String bandeira = identificarBandeira(numero);
        System.out.println("Bandeira identificada: " + bandeira);
    }

    public static String identificarBandeira(String numero) {
        if (numero.matches("^4\\d{12}(\\d{3})?$")) {
            return "Visa";
        }
        if (numero.matches("^(5[1-5]\\d{14})$") ||
            numero.matches("^(222[1-9]|22[3-9]\\d|2[3-6]\\d{2}|27[01]\\d|2720)\\d{12}$")) {
            return "MasterCard";
        }
        if (numero.matches("^(34|37)\\d{13}$")) {
            return "American Express";
        }
        if (numero.matches("^(6011\\d{12}|65\\d{14}|64[4-9]\\d{13})$")) {
            return "Discover";
        }
        if (numero.matches("^(6062)\\d{12}$")) {
            return "Hipercard";
        }
        if (numero.matches("^(4011|4312|4389|4514|4576|5041|5066|5067|509|6277|6362|6363)\\d+")) {
            return "Elo";
        }
        return "Bandeira não identificada";
    }
}




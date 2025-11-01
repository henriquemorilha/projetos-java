import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto é 2 + 2?:");
        System.out.println("1 - 3");
        System.out.println("2 - 300");
        System.out.println("3 - 4");

        int numero = scanner.nextInt();
        String mensagem;

        if (numero == 1) {
            mensagem = "Resposta incorreta";
        } else if (numero == 2) {
            mensagem = "Resposta incorreta";
        } else if (numero == 3) {
            mensagem = "Resposta correta";
        } else {
            mensagem = "Informe uma resposta válida";
        }

        System.out.println(mensagem);
        scanner.close();
    }
}

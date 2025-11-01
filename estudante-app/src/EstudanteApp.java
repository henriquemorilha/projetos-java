import java.util.Scanner;

public class EstudanteApp {
    public static void main(String[] args) {
        int idade = 28;
        char inicialDoNome = 'H';
        char inicialDoSobrenome = 'M';
        double media = 10.0;
        boolean aprovado = true;
        String nome = "Henrique";
        String sobrenome = "Morilha";

        System.out.println(
            idade + ", " 
            + inicialDoNome + ", " 
            + inicialDoSobrenome + ", "
            + media + ", "
            + aprovado + ", "
            + nome + ", "
            + sobrenome + ", "
        );
        System.out.println(inicialDoNome);
        System.out.println(inicialDoSobrenome);
        System.out.println(media);
        System.out.println(aprovado);
        System.out.println(nome + " " + sobrenome);
        System.out.println(inicialDoNome + " " + inicialDoSobrenome);

        System.out.println(nome.charAt(0));
        System.out.println(nome.charAt(1));

        System.out.println(nome.length());

        System.out.println(nome.charAt(nome.length() -1));

        System.out.println(nome.equals("Henrique"));

        Scanner scanner = new Scanner(System.in);
        media = scanner.nextDouble();

        System.out.println(media);
}
}

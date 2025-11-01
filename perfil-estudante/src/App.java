public class App {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Estudante 1", 2025, 10.0);
        Estudante estudante2 = new Estudante("Estudante 2", 2025, 1.0);

        System.out.println(estudante1.anoParaFormatura);
        System.out.println(estudante2.anoParaFormatura);
    }
}
public class App {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(
            "henrique.morilha", 
            "123", 
            "henrique.morilha@test.com"
        );    
        Usuario usuario2 = new Usuario(
            "usuario2", 
            "ususario2", 
            "usuario2@test.com"
        );

        usuario1.ativo = true;
        System.out.println(usuario1.isAtivo());
        System.out.println(usuario2.isAtivo());
        System.out.println(Usuario.getLimiteCaracteres());

    }

}

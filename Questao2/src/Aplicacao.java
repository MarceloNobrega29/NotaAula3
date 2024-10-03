public class Aplicacao {
    public static void main(String[] args) {

        Cachorro c = new Cachorro("Zeus", "Pastor-Alemão");
        Gato g = new Gato("Bixano","Angorá");

        System.out.println("Informações do cachorro:");
        System.out.println("Nome: " + c.getNome());
        System.out.println("Raça: " + c.getRaca());
        c.caminha();
        c.late();

        System.out.println("\nInformações do Gato:");
        System.out.println("Nome: " + g.getNome());
        System.out.println("Raça: " + g.getRaca());
        g.caminha();
        g.mia();

    }

}

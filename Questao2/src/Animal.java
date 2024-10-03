public class Animal {
    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    protected String nome, raca;

    public void caminha(){
        System.out.println("Eu só quero correr um poucooo!");
    }

}

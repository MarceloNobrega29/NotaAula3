public class Programador extends Funcionario{

    protected String linguagem;

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public void informarLinguagem() {
        System.out.println("O programador trabalha com: " + linguagem);
    }

    public int rep = 0;
}

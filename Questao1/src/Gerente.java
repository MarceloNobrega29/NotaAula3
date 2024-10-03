
public class Gerente extends Funcionario {

    protected String projeto;

    public String getProjeto() {
        return projeto;
    }
    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }
    public void informarProjeto(){
        System.out.println("O gerente trabalha sob o comando do projeto: " + projeto);
    }
}

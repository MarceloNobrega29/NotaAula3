public class Funcionario {

    protected String nome;
    protected int nasc, idade;
    protected double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNasc() {
        return nasc;
    }

    public void setNasc(int nasc) {
        this.nasc = nasc;
    }

    public void informarSalario() {
        System.out.printf("O salário do funcionário é: %.2f " , salario);
    }
    public void calcularIdade() {
        idade = 2024 - nasc;
    }


}

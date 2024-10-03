
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Gerente g = new Gerente();
        Programador p = new Programador();


        do {
            System.out.println("\n Bem-Vindo ao Programa de Cadastros. \n");
            System.out.println("Para cadastrar um Programador - 1 \nPara cadastrar um Gerente - 2\nPara Exibir detalhes do Programador - 3\nPara Exibir detalhes do Gerente - 4");
            int x = sc.nextInt();

            switch (x) {
                case 1:
                    System.out.println("Digite o nome do Programador: ");
                    p.setNome(sc.next());

                    System.out.println("Digite o ano de nascimento do Programador: ");
                    p.setNasc(sc.nextInt());

                    System.out.println("Digite o salário do Programador: ");
                    p.setSalario(sc.nextDouble());

                    System.out.println("Digite a liguagem que o programador trabalha: ");
                    p.setLinguagem(sc.next());

                    break;
                case 2:
                    System.out.println("Digite o nome do Gerente: ");
                    g.setNome(sc.next());

                    System.out.println("Digite o ano de nascimento do Gerente: ");
                    g.setNasc(sc.nextInt());

                    System.out.println("Digite o salário do Gerente: ");
                    g.setSalario(sc.nextDouble());

                    System.out.println("Digite o nome do projeto que o Gerente trabalha: ");
                    g.setProjeto(sc.next());

                    break;
                case 3:
                    System.out.println("Informações do Programador:");
                    System.out.printf("Nome do Programador: %s\n", p.nome);
                    p.calcularIdade();

                    System.out.printf("Idade do Programador: %d\n", p.idade);
                    p.informarLinguagem();
                    p.informarSalario();

                    break;
                case 4:
                    System.out.println("Informações do Gerente:");
                    System.out.printf("Nome do Gerente: %s\n", g.nome);
                    g.calcularIdade();

                    System.out.printf("Idade do Gerente: %d\n", g.idade);
                    g.informarProjeto();
                    g.informarSalario();

                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
            System.out.println("\nPara ver novamente digite: 0");
            int y = sc.nextInt();

        } while (p.rep == 0);


    }
}

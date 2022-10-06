import java.util.Scanner;
public class Projeto {
    String nomeProjeto;
    String descricao;
    String endereco;
    String datainicio;
    String datafim;

    public Projeto(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim) {
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.endereco = endereco;
        this.datainicio = datainicio;
        this.datafim = datafim;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(String datainicio) {
        this.datainicio = datainicio;
    }

    public String getDatafim() {
        return datafim;
    }

    public void setDatafim(String datafim) {
        this.datafim = datafim;
    }

    public static void main(String[] args){
        System.out.println("Para qual opção deseja-se voluntariar?");
        System.out.println("<1> Cadastrar Projeto Distribuir Alimentos");
        System.out.println("<2> Cadastrar Projeto Trabalho Voluntário");
        System.out.println("<3> Sair");

        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        opcao = ler.nextInt();
        while (opcao != 3) {
            if (opcao == 1) {
                DistribuicaoAlimento objAlimento = new DistribuicaoAlimento("Projeto Newton", "Fundada em 1956", "Av Carlos Luz, Caiçara", "10/10/2021", "10/10/2022", "Cesta Básica", 5);
                if (objAlimento.validaProjeto() == true) {
                    System.out.println(objAlimento.imprimeProjeto());
                }
            } else if (opcao == 2) {
                TrabalhoVoluntario objTrabalho = new TrabalhoVoluntario("Projeto Newton", "Fundada em 1956", "Av Carlos Luz, Caiçara", "10/10/2021", "10/10/2022", "Carregamento de Cestas Básicas", 6);
                if (objTrabalho.validaProjeto() == true) {
                    System.out.println(objTrabalho.imprimeProjeto());
                }
            }
        }
    }
}

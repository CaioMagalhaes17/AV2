import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Principal {
    public static void main(String Args[]){
        String nome;
        String dataCriacao;
        String dataN;
        String senha;
        String dataP;
        String texto;
        String linkMidia;
        Scanner ler = new Scanner(System.in);
        System.out.print("Nome: ");
        nome = ler.nextLine();
        System.out.print("\nData Criação: ");
        dataCriacao = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime());
        System.out.print("Data de Nascimento: ");
        dataN = ler.nextLine();
        System.out.print("Senha: ");
        senha = ler.nextLine();

        RedeSocial redesocial = new RedeSocial(dataCriacao, dataN, senha, nome);
        System.out.println("Criar Publicação");
        int i = 999;
        while (i != 0) {
            dataP = "";
            texto = "";
            linkMidia = "";
            System.out.print("Data Publicação");
            dataP = ler.nextLine();
            System.out.print("\nTexto: ");
            texto = ler.nextLine();
            System.out.print("\nlinkMidia");
            Publicacao publicacao = new Publicacao(dataP, texto, linkMidia);
            System.out.print("\nCadastrar Nova publicação?: ");
            System.out.print("\nSim  ");
            System.out.print("\nNão  ");
            String opcao = ler.nextLine();
            redesocial.inserePublicacao(publicacao);
            if (opcao.equals("Não")) {
                i = 0;
            }
        }
        redesocial.imprimePublicacoes();
    }
}

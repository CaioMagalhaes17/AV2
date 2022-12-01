import java.util.ArrayList;

public class RedeSocial {

    String dataCriacao;
    String dataNascimento;
    String senha;
    String nomeUsuario;
    ArrayList<Publicacao> publicacoes = new ArrayList<>();

    public void inserePublicacao(Publicacao publi){
        publicacoes.add(publi);
    }

    public void  imprimePublicacoes(){
        Publicacao obj = new Publicacao();
        System.out.println("Total de Publicações: " + obj.contadorPublicacao);
        for (int i = 0; i < publicacoes.size(); i++){
            System.out.println("Data Publicacao :" + publicacoes.get(i).dataPublicacao + "\nTexto Publicação: " + publicacoes.get(i).getTextoPublicacao());
        }

    }
    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public ArrayList<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(ArrayList<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }

    public RedeSocial(String dataCriacao, String dataNascimento, String senha, String nomeUsuario) {
        this.dataCriacao = dataCriacao;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.nomeUsuario = nomeUsuario;
    }
}

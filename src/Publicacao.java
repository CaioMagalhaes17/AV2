public class Publicacao {
    String dataPublicacao;
    String textoPublicacao;
    String linkMidia;
    static double contadorPublicacao;

    public Publicacao(String dataPublicacao, String textoPublicacao, String linkMidia) {
        this.dataPublicacao = dataPublicacao;
        this.textoPublicacao = textoPublicacao;
        this.linkMidia = linkMidia;
        this.contadorPublicacao();
    }

    public Publicacao(){

    }

    public static double contadorPublicacao(){
        return Publicacao.contadorPublicacao += 1;
    }

    public void setContadorPublicacao(double contadorPublicacao) {
        this.contadorPublicacao = contadorPublicacao;
    }

    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }

    public String getLinkMidia() {
        return linkMidia;
    }

    public void setLinkMidia(String linkMidia) {
        this.linkMidia = linkMidia;
    }



    
}

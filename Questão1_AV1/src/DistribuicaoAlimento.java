public class DistribuicaoAlimento extends Projeto {
    String descAlimento;
    float qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, datainicio, datafim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    public boolean validaProjeto(){
        if (this.datafim == ""){
            return true;
        } else {
            return false;
        }
    }

    public String imprimeProjeto(){
        return "Nome projeto: " + this.getNomeProjeto() + " , Descrição: " + this.getDescricao() + " , Data início: " + this.getDatainicio() + " , Data Fim: " + this.getDatafim() + " , Descrição Alimento: " + this.getDescAlimento() + " , Quantidade: " + this.getQtde();
    }


}

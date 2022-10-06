public class TrabalhoVoluntario extends Projeto {
    String tipoTrabalho;
    int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim, String tipoTrabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, endereco, datainicio, datafim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public boolean validaProjeto(){
        if (this.getDuracaoTrabalho() > 2){
            return true;
        } else {
            return false;
        }
    }

    public String imprimeProjeto(){
        return "Nome projeto: " + this.getNomeProjeto() + " , Descrição: " + this.getDescricao() + " , Data início: " + this.getDatainicio() + " , Data Fim: " + this.getDatafim() + " , Tipo Trabalho: " + this.getTipoTrabalho() + " , Duração Trabalho: " + this.getDuracaoTrabalho();
    }
}

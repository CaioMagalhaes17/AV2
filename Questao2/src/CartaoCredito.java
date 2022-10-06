public class CartaoCredito extends Pagamento {
    String numCartao;
    String titularCartao;
    String bandeiraCartao;

    public String getNumCartao() {
        return numCartao;
    }

    public CartaoCredito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numCartao, String titularCartao, String bandeiraCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.titularCartao = titularCartao;
        this.bandeiraCartao = bandeiraCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }

    public String getBandeiraCartao() {
        return bandeiraCartao;
    }

    public void setBandeiraCartao(String bandeiraCartao) {
        this.bandeiraCartao = bandeiraCartao;
    }

    public String imprimirCupomFiscal(){
        return "Data Pagamento: " + this.getDataHoraPagamento() + " , Número Pagamento: " + this.getNumeroPagamento() + " , Valor Pago: " + this.getValorPago() + " , Número Cartão: " + this.getNumCartao() + " , Títular Cartão: " + this.getTitularCartao() + " , Bandeira do Cartão: " + this.getBandeiraCartao();
    }
}

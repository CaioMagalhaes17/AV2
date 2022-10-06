public class CartaoDebito extends Pagamento{
    String numCartao;
    String titularCartao;

    public CartaoDebito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numCartao, String titularCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.titularCartao = titularCartao;
    }

    public String getNumCartao() {
        return numCartao;
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

    public String imprimirCupomFiscal(){
        return "Data Pagamento: " + this.getDataHoraPagamento() + " , Número Pagamento: " + this.getNumeroPagamento() + " , Valor Pago: " + this.getValorPago() + " , Número Cartão: " + this.getNumCartao() + " , Títular Cartão: " + this.getTitularCartao();
    }
}

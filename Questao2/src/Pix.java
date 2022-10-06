public class Pix extends Pagamento {
    boolean comprovanteTransacaoPix;

    public Pix(String dataHoraPagamento, int numeroPagamento, double valorPago, boolean comprovanteTransacaoPix) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    public boolean isComprovanteTransacaoPix() {
        return comprovanteTransacaoPix;
    }

    public void setComprovanteTransacaoPix(boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    public String imprimirCupomFiscal(){
        if (this.isComprovanteTransacaoPix() == true){
            return "Data Pagamento: " + this.getDataHoraPagamento() + " , Número Pagamento: " + this.getNumeroPagamento() + " , Valor Pago: " + this.getValorPago() + " Tem Comprovante";
        } else {
            return "Data Pagamento: " + this.getDataHoraPagamento() + " , Número Pagamento: " + this.getNumeroPagamento() + " , Valor Pago: " + this.getValorPago() + " NÃO Tem Comprovante";
        }
    }
}

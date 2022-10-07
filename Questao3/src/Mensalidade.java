public class Mensalidade {
    double valorMensalidade;
    int numeroIrmaos;

    public Mensalidade(double valorMensalidade, int numeroIrmaos) {
        this.valorMensalidade = valorMensalidade;
        this.numeroIrmaos = numeroIrmaos;
    }

    public double calcularMensalidade(){
        if (this.numeroIrmaos == 1){
            this.valorMensalidade = this.valorMensalidade - (this.valorMensalidade * 0.05);
        } else if (this.numeroIrmaos == 2){
            this.valorMensalidade = this.valorMensalidade - (this.valorMensalidade * 0.1);
        } else if (this.numeroIrmaos > 2){
            this.valorMensalidade = this.valorMensalidade - (this.valorMensalidade * 0.15);
        } else if (this.numeroIrmaos == 0){
            this.valorMensalidade = 0;
        }
        return this.valorMensalidade;
    }

    public static void main(String[] args){
        Mensalidade objMensalidade = new Mensalidade(1500, 2);
        System.out.println("Valor Mensalidade com Desconto: " + objMensalidade.valorMensalidade);
    }
}

public class Financiamento {
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    public  Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual){
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    double PagamentoMensal(){
       return (this.valorImovel / this.prazoFinanciamento) * (1 + (this.taxaJurosAnual / 12));
    }

    public double TotalPagamento(){
        double value;
        value = PagamentoMensal();
        return value * this.prazoFinanciamento;
    }
}

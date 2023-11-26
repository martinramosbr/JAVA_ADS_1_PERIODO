package modelo;

public class Casa  extends Financiamento{
    private double taxaExtra;

    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, double taxaExtra) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.taxaExtra = taxaExtra;
    }
    public double PagamentoMensal(){
        return (getValorImovel() / getPrazoFinanciamento()) * (1 + (getTaxaJurosAnual() / 12));
    }

    public double TotalPagamento(){
        setTotalPagamento(PagamentoMensal() * getPrazoFinanciamento() + this.taxaExtra);
        return PagamentoMensal() * getPrazoFinanciamento() + this.taxaExtra;
    }

}

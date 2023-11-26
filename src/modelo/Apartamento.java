package modelo;

public class Apartamento extends Financiamento {

    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual){
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }

    public double TaxaMensal(){
        return getTaxaJurosAnual() / 12;
    }
    public double ValorMensal(){
        return getValorImovel() * TaxaMensal() * (1 + TaxaMensal()) / ((1+ TaxaMensal()) -1);
    }
    public double TotalPagamento(){
        setTotalPagamento(ValorMensal() * getPrazoFinanciamento());
        return ValorMensal() * getPrazoFinanciamento();
    }
}

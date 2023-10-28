package modelo;

import java.text.DecimalFormat;

public class Financiamento {
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    public double PagamentoMensal(){
       return (this.valorImovel / this.prazoFinanciamento) * (1 + (this.taxaJurosAnual / 12));
    }

    public double TotalPagamento(){
        return PagamentoMensal() * this.prazoFinanciamento;
    }

    public void ConsultaFinanciamento(){
        String valorImovel = FormatoMonetario(getValorImovel());
        System.out.println("Valor do imóvel: R$ " + valorImovel);
        System.out.println("Prazo do financiamento: " + getPrazoFinanciamento() + " meses.");
        System.out.println("Taxa de juros: " + getTaxaJurosAnual() + "%");
        System.out.print("\n");
    }

    public String FormatoMonetario(double valor){
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return df.format(valor);
    }

    public double getValorImovel(){
        return this.valorImovel;
    }

    public int getPrazoFinanciamento(){
        return this.prazoFinanciamento;
    }

    public double getTaxaJurosAnual(){
        return this.taxaJurosAnual;
    }

    public void setValorImovel(double val){
       this.valorImovel = val;
    }

    public void setPrazoFinanciamento(int val){
        this.prazoFinanciamento = val;
    }

    public void setTaxaJurosAnual(double val){
       this.taxaJurosAnual = val;
    }
}

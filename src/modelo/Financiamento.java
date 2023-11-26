package modelo;

import java.text.DecimalFormat;

public class Financiamento {
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;
    private double totalPagamento;


    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual){
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }


    public void ConsultaFinanciamento(){
        String valorImovel = FormatoMonetario(getValorImovel());
        System.out.println("Valor do imóvel: R$ " + valorImovel);
        System.out.println("Prazo do financiamento: " + getPrazoFinanciamento() + " meses.");
        System.out.println("Taxa de juros: " + getTaxaJurosAnual() + "%");
        System.out.print("\n");
    }

    public double TotalFinanciamento(){
        return this.totalPagamento;
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

  public void setTotalPagamento(double totalPagamento){
      this.totalPagamento = totalPagamento;
  }


}

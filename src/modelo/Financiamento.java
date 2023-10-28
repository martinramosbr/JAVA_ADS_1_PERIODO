package modelo;

import java.text.DecimalFormat;

public class Financiamento {
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    public  Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual){
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double PagamentoMensal(){
       return (this.valorImovel / this.prazoFinanciamento) * (1 + (this.taxaJurosAnual / 12));
    }

    public double TotalPagamento(){
        double value;
        value = PagamentoMensal();
        return value * this.prazoFinanciamento;
    }

    public void ConsultaFinanciamento(){
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String valorformatado = df.format(this.valorImovel);

        System.out.println("Valor do imóvel: R$ " + valorformatado);
        System.out.println("Prazo do financiamento: " + this.prazoFinanciamento + " meses.");
        System.out.println("Taxa de juros: " + this.taxaJurosAnual + "%");
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
}

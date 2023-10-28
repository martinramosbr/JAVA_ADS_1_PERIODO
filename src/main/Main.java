package main;

import modelo.Financiamento;
import util.InterfaceUsuario;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario interfaceUser= new InterfaceUsuario();
        double valorImovel = interfaceUser.ValorDoImovel();
        int prazoFinanciamento = interfaceUser.PrazoDeFinanciamento();
        double taxaJuros = interfaceUser.TaxaDeJuros();

        Financiamento financiamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJuros);
        double valorMensal = financiamento.TotalPagamento();
        interfaceUser.ImprimeMensalidade(valorMensal);

        financiamento.ConsultaFinanciamento();
    }
}

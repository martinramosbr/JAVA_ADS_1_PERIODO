package main;

import modelo.Financiamento;
import util.InterfaceUsuario;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Financiamento> listaDeFinanciamentos = new ArrayList<>();

        InterfaceUsuario interfaceUser = new InterfaceUsuario();
        Financiamento financiamento1 = new Financiamento();
        Financiamento casaPraia = new Financiamento();
        Financiamento casaCampo = new Financiamento();
        Financiamento casaCidade = new Financiamento();
        Financiamento apartamento = new Financiamento();

        financiamento1.setValorImovel(interfaceUser.ValorDoImovel());
        financiamento1.setPrazoFinanciamento(interfaceUser.PrazoDeFinanciamento());
        financiamento1.setTaxaJurosAnual(interfaceUser.TaxaDeJuros());
        interfaceUser.ImprimeFinanciamento(financiamento1.TotalPagamento());
        financiamento1.ConsultaFinanciamento();

        casaPraia.setValorImovel(150000.00);
        casaPraia.setPrazoFinanciamento(64);
        casaPraia.setTaxaJurosAnual(13.9);

        casaCampo.setValorImovel(100000.00);
        casaCampo.setPrazoFinanciamento(48);
        casaCampo.setTaxaJurosAnual(13.9);

        casaCidade.setValorImovel(3500000.00);
        casaCidade.setPrazoFinanciamento(128);
        casaCidade.setTaxaJurosAnual(13.9);

        apartamento.setValorImovel(300000.00);
        apartamento.setPrazoFinanciamento(128);
        apartamento.setTaxaJurosAnual(13.9);

        listaDeFinanciamentos.add(financiamento1);
        listaDeFinanciamentos.add(casaPraia);
        listaDeFinanciamentos.add(casaCampo);
        listaDeFinanciamentos.add(casaCidade);
        listaDeFinanciamentos.add(apartamento);

        double totalImoveis = 0;
        double totalFinanciamentos = 0;

        for (int i = 0; i < listaDeFinanciamentos.size(); i++) {
            int f = i + 1;
            totalImoveis += listaDeFinanciamentos.get(i).getValorImovel();
            totalFinanciamentos += listaDeFinanciamentos.get(i).TotalPagamento();

            System.out.println("Financiamento " + f + " – valor do imóvel: R$ " + financiamento1.FormatoMonetario(listaDeFinanciamentos.get(i).getValorImovel()) + ", valor do financiamento: R$ " + financiamento1.FormatoMonetario(listaDeFinanciamentos.get(i).TotalPagamento()));
        }
        System.out.println("Total de todos os imóveis: R$ " + financiamento1.FormatoMonetario(totalImoveis) + ", total de todos os financiamentos: R$" + financiamento1.FormatoMonetario(totalFinanciamentos) + ".\n");
    }
}

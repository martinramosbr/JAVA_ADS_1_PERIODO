package main;

import modelo.Apartamento;
import modelo.Casa;
import modelo.Financiamento;
import modelo.Terreno;
import util.InterfaceUsuario;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Financiamento> listaDeFinanciamentos = new ArrayList<>();

        InterfaceUsuario interfaceUser = new InterfaceUsuario();

        Casa casa = new Casa(interfaceUser.ValorDoImovel(), interfaceUser.PrazoDeFinanciamento(), interfaceUser.TaxaDeJuros(), 80.00);

        Financiamento casa2 = new Casa(500000.00, 10, 10, 80.00);
        Financiamento apartamento1 = new Apartamento(500000.00, 10, 10);
        Financiamento apartamento2 = new Apartamento(500000.00, 10, 10);
        //Financiamento terreno1 = new Terreno(3500000.00, 128, 13.9);

        interfaceUser.ImprimeFinanciamento(casa.TotalPagamento());
        interfaceUser.ImprimeFinanciamento(((Apartamento) apartamento1).TotalPagamento());
        casa.ConsultaFinanciamento();


        listaDeFinanciamentos.add(casa);
        //listaDeFinanciamentos.add(casa2);
        listaDeFinanciamentos.add(apartamento1);
        //listaDeFinanciamentos.add(apartamento2);
        //listaDeFinanciamentos.add(terreno1);


        double totalImoveis = 0;
        double totalFinanciamentos = 0;

        for (int i = 0; i < listaDeFinanciamentos.size(); i++) {
            int f = i + 1;
            totalImoveis += listaDeFinanciamentos.get(i).getValorImovel();
            totalFinanciamentos += listaDeFinanciamentos.get(i).TotalFinanciamento();

            System.out.println("Financiamento " + f + " – valor do imóvel: R$ " + casa.FormatoMonetario(listaDeFinanciamentos.get(i).getValorImovel()) + ", valor do financiamento: R$ " + casa.FormatoMonetario(listaDeFinanciamentos.get(i).TotalFinanciamento()));
        }
       System.out.println("Total de todos os imóveis: R$ " + casa.FormatoMonetario(totalImoveis) + ", total de todos os financiamentos: R$" + casa.FormatoMonetario(totalFinanciamentos) + ".\n");
    }
}

package util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class InterfaceUsuario {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.FRANCE);
    DecimalFormat decimalFormat;

    public InterfaceUsuario(){
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.FRANCE);
        decimalFormat = new DecimalFormat("#,##0.00", symbols);
    }

    public double ValorDoImovel() {
        double valor;
        do {
            System.out.print("Digite o valor do imóvel: R$ ");
            valor = scanner.nextDouble();
            if (valor < 10000 ){
                System.out.println("Valor inválido. O valor minimo para financiamento é: R$ 10.000,00.");
            }
        } while (valor < 10000);
        return valor;

    }

    public int PrazoDeFinanciamento(){
        int prazo;
        do {
            System.out.print("Digite a quantidade de meses: ");
            prazo = scanner.nextInt();
            if (prazo <= 0 || prazo > 128) {
                System.out.println("Prazo inválido. Por favor, digite um prazo maior que 0 e menor que 128 meses.");
            }
        } while (prazo <= 0 || prazo > 128);
        return prazo;
    }

    public double TaxaDeJuros(){
        double taxa;
        do {
            System.out.print("Digite a taxa de juros: ");
            taxa = scanner.nextDouble();
            if (taxa <= 0 || taxa > 100){
                System.out.println("Taxa de juros inválida. Por favor, digite uma taxa entre 0% e 100%.");
            }
        }while (taxa <= 0 || taxa > 100);
        return taxa;
    }

    public void ImprimeMensalidade(double valor){
        String valorFormatado = decimalFormat.format(valor);
        System.out.println("O valor do financiamento é R$ " + valorFormatado);
    }
}

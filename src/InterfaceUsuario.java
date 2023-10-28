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
        System.out.print("Digite o valor do imóvel: R$ ");
        return scanner.nextDouble();

    }

    public int PrazoDeFinanciamento(){
        System.out.print("Digite a quantidade de meses: ");
        return scanner.nextInt();
    }

    public double TaxaDeJuros(){
        System.out.print("Digite a taxa de juros: ");
        return scanner.nextDouble();

    }

    public void ImprimeMensalidade(double valor){
        String valorFormatado = decimalFormat.format(valor);
        System.out.print("O valor do financiamento é R$ " + valorFormatado);
    }
}

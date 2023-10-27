import java.util.Scanner;

public class InterfaceUsuario {
    Scanner scanner = new Scanner(System.in);

    public double ValorDoImovel() {
        System.out.print("Digite o valor do imóvel: ");
        return Double.parseDouble(scanner.nextLine());

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
        System.out.print("O valor do financiamento é " + valor);
    }
}

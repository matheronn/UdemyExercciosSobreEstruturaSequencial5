import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod1 = sc.nextInt(); //exercicio pede para ler o codigo do produto
		int qtd1 = sc.nextInt();
		double valoruni1 = sc.nextDouble();

		int cod2 = sc.nextInt(); 
		int qtd2 = sc.nextInt();
		double valoruni2 = sc.nextDouble();

		double total = (qtd1 * valoruni1) + (qtd2 * valoruni2);

		System.out.printf("Valor a pagar: R$ %.2f%n", total);

		sc.close();

	}
}
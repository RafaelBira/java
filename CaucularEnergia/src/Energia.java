import java.util.Scanner;

public class Energia {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salario, kwQuantidade, kwValor, contaPagar, contaPagarDesconto;
		System.out.println("digite o valor do salário mínimo");
		salario = teclado.nextDouble();
		System.out.println("digite o valor de quilowatts consumidos");
		kwQuantidade = teclado.nextDouble();
		kwValor = salario / 700;
		contaPagar = salario / 7 / 100 * kwQuantidade;
		contaPagarDesconto = contaPagar - contaPagar / 100 * 10;
		System.out.println("valor em reais do quilowatts é " + kwValor);
		System.out.println("o valor da conta a pagar é r$" + contaPagar);
		System.out.println("valor da conta a pagar com 10 porcento de desconto é r$" + contaPagarDesconto);
	}
}

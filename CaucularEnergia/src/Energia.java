import java.util.Scanner;

public class Energia {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salario, kwQuantidade, kwValor, contaPagar, contaPagarDesconto;
		System.out.println("digite o valor do sal�rio m�nimo");
		salario = teclado.nextDouble();
		System.out.println("digite o valor de quilowatts consumidos");
		kwQuantidade = teclado.nextDouble();
		kwValor = salario / 700;
		contaPagar = salario / 7 / 100 * kwQuantidade;
		contaPagarDesconto = contaPagar - contaPagar / 100 * 10;
		System.out.println("valor em reais do quilowatts � " + kwValor);
		System.out.println("o valor da conta a pagar � r$" + contaPagar);
		System.out.println("valor da conta a pagar com 10 porcento de desconto � r$" + contaPagarDesconto);
	}
}

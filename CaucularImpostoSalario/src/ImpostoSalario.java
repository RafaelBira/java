import java.util.Scanner;

public class ImpostoSalario {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salario;
		System.out.println("digite seu sal�rio");
		salario = teclado.nextDouble();
		if (salario < 1000) {
			System.out.println("voc� n�o paga imposto, seu sal�rio � " + salario);
		} else if (salario >= 1000 && salario <= 2500) {
			salario = salario - salario / 100 * 12.5;
			System.out.println("pagando imposto, seu sal�rio � " + salario);
		} else if (salario >= 2500 && salario <= 5000) {
			salario = salario - salario / 100 * 25;
			System.out.println("pagando imposto, seu sal�rio � " + salario);
		} else {
			salario = salario - 1300;
			System.out.println("pagando imposto, seu sal�rio � " + salario);
		}
	}
}

import java.util.Scanner;

public class ImpostoSalario {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salario;
		System.out.println("digite seu salário");
		salario = teclado.nextDouble();
		if (salario < 1000) {
			System.out.println("você não paga imposto, seu salário é " + salario);
		} else if (salario >= 1000 && salario <= 2500) {
			salario = salario - salario / 100 * 12.5;
			System.out.println("pagando imposto, seu salário é " + salario);
		} else if (salario >= 2500 && salario <= 5000) {
			salario = salario - salario / 100 * 25;
			System.out.println("pagando imposto, seu salário é " + salario);
		} else {
			salario = salario - 1300;
			System.out.println("pagando imposto, seu salário é " + salario);
		}
	}
}

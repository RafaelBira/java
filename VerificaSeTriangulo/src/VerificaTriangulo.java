import java.util.Scanner;

public class VerificaTriangulo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double lado1, lado2, lado3;
		boolean triangulo = false;
		System.out.println("digite o valor do lado 1");
		lado1 = teclado.nextDouble();
		System.out.println("digite o valor do lado 2");
		lado2 = teclado.nextDouble();
		System.out.println("digite o valor do lado 3");
		lado3 = teclado.nextDouble();
		if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
			triangulo = true;
		}
		if (triangulo == true) {
			System.out.println("é triângulo");
		} else {
			System.out.println("não é triângulo");
		}
	}
}

import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double area, base, altura;
		System.out.println("digite o valor da base");
		base = teclado.nextDouble();
		System.out.println("digite o valor da altura");
		altura = teclado.nextDouble();
		area = (base * altura) / 2;
		System.out.println("a área total é " + area);
	}
}

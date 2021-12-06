import java.util.Scanner;

public class Cilindro {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double volume, raio, altura, pi = 3.14;
		System.out.println("digite o valor do raio");
		raio = teclado.nextDouble();
		System.out.println("digite o valor da altura");
		altura = teclado.nextDouble();
		volume = pi * raio * raio * altura;
 	System.out.println("o volume total é "+volume);
	}
}

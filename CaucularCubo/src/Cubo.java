import java.util.Scanner;

public class Cubo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double volume, lado;
		System.out.println("digite o valor do lado");
		lado = teclado.nextDouble();
		volume = lado * lado * lado;
		System.out.println("o volume total é " + volume);
	}
}

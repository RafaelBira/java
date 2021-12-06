import java.util.Scanner;

public class Losango {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double area, diagonal1, diagonal2;
		System.out.println("digite a diagonal 1");
		diagonal1 = teclado.nextDouble();
		System.out.println("digite a diagonal 2");
		diagonal2 = teclado.nextDouble();
		area = diagonal1 * diagonal2;
		System.out.println("a área total é " + area);
	}
}

import java.util.Scanner;

public class Quadrado {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double lado, area;
		System.out.println("digite o valor de um lado do quadrado");
		lado = teclado.nextDouble();
		area = lado * lado;
		System.out.println("a área total é " + area);
	}
}

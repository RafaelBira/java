import java.util.Scanner;

public class Trapezio {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double area, baseMenor, baseMaior, altura;
		System.out.println("digite o valor da base menor");
		baseMenor = teclado.nextDouble();
		System.out.println("digite o valor da base maior");
		baseMaior = teclado.nextDouble();
		System.out.println("digite o valor da altura");
		altura = teclado.nextDouble();
		area = (baseMenor + baseMaior) * altura / 2;
		System.out.println("a área total é " + area);
	}
}

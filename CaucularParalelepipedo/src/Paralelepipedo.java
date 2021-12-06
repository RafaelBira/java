import java.util.Scanner;

public class Paralelepipedo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double volume, altura, largura, profundidade;
		System.out.println("digite o valor da altura");
		altura = teclado.nextDouble();
		System.out.println("digite o valor da largura");
		largura = teclado.nextDouble();
		System.out.println("digite o valor da profundidade");
		profundidade = teclado.nextDouble();
		volume = altura * largura * profundidade;
		System.out.println("o volume total é " + volume);
	}
}

import java.util.Scanner;

public class Consumo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double combustivel, km, media;
		System.out.println("digite a dist�ncia percorrida em quil�metros");
		km = teclado.nextDouble();
		System.out.println("digite a quantidade de combust�vel em litros");
		combustivel = teclado.nextDouble();
		media = km / combustivel;
		System.out.println("o consumo m�dio � de " + media + " quil�metros por litro");
	}
}

import java.util.Scanner;

public class Consumo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double combustivel, km, media;
		System.out.println("digite a distância percorrida em quilômetros");
		km = teclado.nextDouble();
		System.out.println("digite a quantidade de combustível em litros");
		combustivel = teclado.nextDouble();
		media = km / combustivel;
		System.out.println("o consumo médio é de " + media + " quilômetros por litro");
	}
}

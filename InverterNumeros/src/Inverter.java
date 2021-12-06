import java.util.Scanner;

public class Inverter {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeroOriginal, numeroInvertido, unidade, dezena, centena, resto;
		System.out.println("digite um número de 3 dígitos para inverter");
		numeroOriginal = teclado.nextInt();
		centena = numeroOriginal / 100;
		resto = numeroOriginal % 100;
		dezena = resto / 10;
		unidade = resto % 10;
		numeroInvertido = unidade * 100 + dezena * 10 + centena;
		System.out.println("o número invertido é " + numeroInvertido);
	}
}

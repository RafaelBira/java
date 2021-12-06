import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, notaMedia;
		System.out.println("digite a nota 1");
		nota1 = teclado.nextDouble();
		System.out.println("digite a nota 2");
		nota2 = teclado.nextDouble();
		notaMedia = (nota1 + nota2) / 2;
		System.out.println("a média das notas é " + notaMedia);
		if (notaMedia >= 6) {
			System.out.println("parabéns, com base na nota média, você foi aprovado!");
		} else {
			System.out.println("com base na nota média, infelizmente você não foi aprovado");
		}
	}
}

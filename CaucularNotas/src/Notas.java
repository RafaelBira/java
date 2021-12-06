import java.util.Scanner;

public class Notas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, notaMedia;
		System.out.println("digite a primeira nota");
		nota1 = teclado.nextDouble();
		System.out.println("digite a segunda nota");
		nota2 = teclado.nextDouble();
		notaMedia = (nota1 + nota2) / 2;
		System.out.println("a nota média é " + notaMedia);
		if (notaMedia >= 9 && notaMedia <= 10) {
			System.out.println("aprovado no conceito A");
		} else if (notaMedia >= 8 && notaMedia < 9) {
			System.out.println("aprovado no conceito B");
		} else if (notaMedia >= 6 && notaMedia < 8) {
			System.out.println("aprovado no conceito C");
		} else if (notaMedia >= 3 && notaMedia < 6) {
			System.out.println("em recuperação");
		} else {
			System.out.println("reprovado");
		}
	}
}

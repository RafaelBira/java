import java.util.Scanner;

public class Media2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, notaMedia;
		System.out.println("digite a nota 1");
		nota1 = teclado.nextDouble();
		System.out.println("digite a nota 2");
		nota2 = teclado.nextDouble();
		notaMedia = (nota1 + nota2) / 2;
		System.out.println("a nota média é " + notaMedia);
		if (notaMedia >= 8 && notaMedia <= 10) {
			System.out.println("aprovado com louvor");
		} else if (notaMedia >= 6 && notaMedia < 8) {
			System.out.println("aprovado");
		} else if (notaMedia >= 5 && notaMedia < 6) {
			System.out.println("em recuperação");
		} else {
			System.out.println("reprovado");
		}
	}
}

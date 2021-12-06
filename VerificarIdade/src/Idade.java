import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade;
		System.out.println("digite sua idade");
		idade = teclado.nextInt();
		if (idade < 18) {
			System.out.println("você deve estar ansioso para fazer 18 anos né...");
		} else {
			System.out.println("você deve ter muitos problemas para resolver, vida de adulto não é fácil...");
			if (idade > 65) {
				System.out.println("você deve ter aproveitado muito a vida...");
			}
		}
	}
}

import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade;
		System.out.println("digite sua idade");
		idade = teclado.nextInt();
		if (idade < 18) {
			System.out.println("voc� deve estar ansioso para fazer 18 anos n�...");
		} else {
			System.out.println("voc� deve ter muitos problemas para resolver, vida de adulto n�o � f�cil...");
			if (idade > 65) {
				System.out.println("voc� deve ter aproveitado muito a vida...");
			}
		}
	}
}

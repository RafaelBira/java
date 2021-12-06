import java.util.Scanner;

public class TesteEntrada {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	int valor;
System.out.println("digite um número inteiro");
valor=teclado.nextInt();
System.out.println("você digitou: "+valor);
}
}

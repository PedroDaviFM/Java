package exercicios;
import java.util.Scanner;

public class numero {
	public static void main(String[] args) {
		int numero;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número que irei dizer seu sucessor e seu antecessor: ");
		numero = ler.nextInt();
		
		int sucessor = numero + 1;
		int antecessor = numero - 1;
		System.out.println("o sucessor de "+ numero + " é " + sucessor + " e o seu antecerssor é " + antecessor);
	}
}

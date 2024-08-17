package exercicios;
import java.util.Scanner;
public class parImpar {

	public static void main(String[] args) {
		int num;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número de 0 a 10: ");
		num = ler.nextInt();
		
		if(num < 11  && num % 2 == 0) {
			System.out.println("O número é par");
		}
		else if(num < 11 && num % 2 == 1) {
			System.out.println("O número é impar");
		}
		else {
			System.out.println("Por favor tente novamente, digitando um número de 0 a 10");
		}
	}
}

package exercicios;
import java.util.Scanner;
public class palavraLetra {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite uma palavra: ");
	String palavra = ler.nextLine();
	
	char letra[] = palavra.toCharArray();
	
	for(int i= 0 ; i < letra.length; i++) {
		System.out.println(letra[i]);
	}

		ler.close();
}
}

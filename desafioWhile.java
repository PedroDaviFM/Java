package exercicios;
import java.util.Scanner;

public class desafioWhile {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String fechar = "";
		
		while(!fechar.equalsIgnoreCase("sair")) {
			System.out.println("Digite sair para sair: ");
			fechar = ler.next();
		}
	}
}

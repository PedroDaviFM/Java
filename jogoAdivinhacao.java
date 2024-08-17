package exercicios;
import java.util.Scanner;
public class jogoAdivinhacao {
	public static void main(String[] args) {
		for(int i = 11; i >= 0; i--) {
			int numCerto = 66;
			int num;
			Scanner ler = new Scanner(System.in);
			
			System.out.println("\nTente adivinhar o número que estou pensando!");
			num = ler.nextInt();
			
			if (num == numCerto) {
				System.out.printf("Parabéns você acertou com %d tentativas sobrando!", i);
				break;
			}else if(num < numCerto) {
				System.out.println("Errado! O número que eu pensei é maior!");
				System.out.printf("Você ainda tem %d/11 tentativas", i);
				continue;
			}else if(num > numCerto) {
				System.out.println("Errado! O número que eu pensei é menor!");
				System.out.printf("Você ainda tem %d/11 tentativas", i);
				continue;
			}else if(i == 0) {
				System.out.println("Suas tentativas acabaram");
			}else {
				System.out.println("nada");
			}
		}
	}
}

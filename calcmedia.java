package exercicios;
import java.util.Scanner;
public class mediaSemestre {
	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		int num6;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite 3 números que eu irei fazer a média");
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		num3 = ler.nextInt();
		
		double media1 = num1 + num2 + num3 / 3;
		
		System.out.println("A média desses número é de: " + media1);
		
		System.out.println("Agora digite mais 3 números, que irei fazer a média: ");
		num4 = ler.nextInt();
		num5 = ler.nextInt();
		num6 = ler.nextInt();
		
		double media2 = num4 + num5 + num6/3;
		
		System.out.println("A média desses números é de: " + media2);
		
		System.out.println("Agora irei fazer a média dessas médias");
		
		double totalMedia = media1 + media2 / 2;
		
		System.out.println("A média das médias é de: " + totalMedia);
	}	
}

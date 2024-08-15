package exercicios;
import java.util.Scanner;
public class calcValor {
	public static void main(String[] args) {
		String produto1;
		String produto2;
		double preco1;
		double preco2;
		int quantidade1;
		int quantidade2;
		double ipi = 0.20;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o nome do primeiro produto: ");
		produto1 = ler.next();
		System.out.println("Digite o preço desse produto: ");
		preco1 = ler.nextDouble();
		System.out.println("Agora informe quantos você pegou: ");
		quantidade1 = ler.nextInt();
		
		System.out.println("Digite o nome do segundo produto: ");
		produto2 = ler.next();
		System.out.println("Digite o preço desse produto: ");
		preco2 = ler.nextDouble();
		System.out.println("Agora digite a quantidade: ");
		quantidade2 = ler.nextInt();
		
		System.out.println("descrição do produto 1: " + produto1);
		System.out.println(preco1);
		System.out.println(quantidade1);
		double total1 = preco1 * quantidade1;
		System.out.println("Valor total do produto 1 é: " + total1);
		System.out.println("Descrição do produto 2: " + produto2);
		System.out.println(preco2);
		System.out.println(quantidade2);
		double total2 = preco2 + quantidade2;
		System.out.println("Valor total do produto 2: " + total2);
		
		double valorTotal = (total1 + total2)*(ipi + 1); 

		System.out.println("O valor total dos 2 produtos com o IPI é de: " + valorTotal);
	}
}

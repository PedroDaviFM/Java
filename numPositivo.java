package exercicios;
import java.util.Scanner;
public class numPositivo {
public static void main(String[] args) {
	  Scanner ler = new Scanner(System.in);

	  int soma = 0;
	  int num = 0;

	  while (num >= 0) {
	   System.out.println("Digite um numero inteiro (ou negativo para sair): ");
	   num = ler.nextInt();
	   if (num >= 0) {
	    soma += num; // Isso é igual a somadorDeNumeros = somadorDeNumeros + numero;
	    System.out.printf("\nSoma até o momento: %d\n", soma);
	   }
	  }
	  ler.close();
	 }
	}

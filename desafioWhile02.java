package exercicios;
import java.util.Scanner;

public class desafioWhile {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int nota = 0;
		int numNotas = 0;
		int contador = 0;
		 
		while(nota != -1) {
			System.out.println("Digite uma nota: ");
			nota = ler.nextInt();
			if(nota <= 10 && nota >=0) {
			contador += nota;
			numNotas++;
		}else if(nota != -1){
			System.out.println("Nota inválida");
		}
		}
		double media = contador / numNotas;
		System.out.println("A média das notas é: " + media);
	}
}

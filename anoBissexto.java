package exercicios;
import java.util.Scanner;
public class anoBissexto {
public static void main(String[] args) {
	int ano;
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Diga-me um ano e direi se ele é ou não um ano Bissexto!");
	ano = ler.nextInt();
	
	if (ano % 4 == 0) {
		System.out.println("Parabéns, esse ano é bissexto!");
	}
	else {
		System.out.println("É um ano normal!");
	}
}
}

package exercicios;
import java.util.Scanner;
public class faixasKarate {
public static void main(String[] args) {
	String faixa;
	Scanner ler = new Scanner(System.in);
	System.out.println("Diga em qual faixa você está atualmente: ");
	faixa = ler.next();
	
	switch (faixa.toLowerCase()) {
	case "preta":
		System.out.println("Sei o Basaidai");
	case "marrom":
		System.out.println("Sei o Shodan");
	case "roxa":
		System.out.println("Sei o Godan");
	case "verde":
		System.out.println("Sei o Yodan");
	case "laranja":
		System.out.println("Sei o Sandan");
	case "vermelha":
		System.out.println("Sei o Nidan");
	case "amarela":
		System.out.println("Sei o Shodan");
}	
}
}

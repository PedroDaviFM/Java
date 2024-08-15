package exercicios;
import java.util.Scanner;

public class saldo {
	public static void main(String[] args) {
	double saldo;
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite seu saldo: ");
	saldo = ler.nextDouble();
	double porcentagem = saldo * 0.01;
	double reajuste = saldo - porcentagem;
	
	System.out.println("Com o reajuste de 1%, seu saldo é de: " + reajuste);
	}
}

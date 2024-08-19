package Classe;
import java.util.Scanner;
public class areaCircunferenciaTeste {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio da circunferencia: ");
		areaCircunferencia a = new areaCircunferencia(ler.nextDouble());
		
		System.out.println(a.area());
	}
}

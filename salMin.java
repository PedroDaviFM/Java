package exercicios;
import java.util.Scanner;

public class salmin {
public static void main(String[] args) {
	double salMin = 788;
	double salario;
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite seu salário: ");
	salario = ler.nextDouble();
	System.out.println("Agora verei quantos salários minimos você ganha! \n");
	double qntdSM = salario / salMin;
	
	System.out.println("Seu salário é: " + salario + ", o salario minimo é: " + salMin + ". Logo você recebe " + qntdSM + " salários minimos");                    
}
}

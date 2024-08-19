package Classe;
import java.util.Scanner;
public class dataTeste {
public static void main(String[] args) {
	data d1 = new data();
	d1.dia = 0;
	d1.mes = 0;
	d1.ano = 0;
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite o dia: (dd)");
	d1.dia = ler.nextInt();
	System.out.println("Digite o mês: (mm)");
	d1.mes = ler.nextInt();
	System.out.println("Digite o ano: (aa)");
	d1.ano = ler.nextInt();
	
	System.out.printf("%d/%d/%d", d1.dia, d1.mes, d1.ano);
}
}

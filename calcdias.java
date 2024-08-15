package exercicios;
import java.util.Scanner;

public class calcdias {

	public static void main(String[] args) {
			int anos;
			int mes;
			int dias;
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Digite quantos anos você tem: ");
			anos = ler.nextInt();
			int totalAno = anos*365;
			System.out.println("Digite quantos meses fazem desde seu último aniversário: ");
			mes = ler.nextInt();
			int totalMes = mes*30; 
			System.out.println("Digite quantos dias: ");
			dias = ler.nextInt();
			
			int totalDias = totalAno + totalMes + dias;
			
			System.out.println("No total você viveu: " + totalDias + " dias");
	}

}

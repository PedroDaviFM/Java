package exercicios;
import java.util.Scanner;
public class notaConceito {
public static void main(String[] args) {
	String conceito = "";
	int nota;
	Scanner ler = new Scanner(System.in);
	
	System.out.print("Digite a nota: ");
	nota = ler.nextInt();
	
	switch (nota){
		case 1: case 2:
			conceito = "A";
			break;
		case 3: case 4:
			conceito = "B";
			break;
		case 5: case 6:
			conceito = "C";
			break;
		case 7: case 8:
			conceito = "D"; 
			break;	
		default:
			conceito = "Não informado";
			break;
	}
}
}

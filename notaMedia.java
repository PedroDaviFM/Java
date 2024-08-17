package exercicios;
import java.util.Scanner;
public class notaMedia {
public static void main(String[] args) {
	double nota1;
	double nota2;
	Scanner ler =new Scanner(System.in);
	
	System.out.println("Bem vindo! Irei calcular a média de suas notas!");
	System.out.println("Primeiro informe-nos sua nota parcial: ");
	nota1 = ler.nextDouble();
	System.out.println("Ok! Agora digite a nota bimestral: ");
	nota2 = ler.nextDouble();
	System.out.println("Irei fazer a média");
	double media = (nota1 + nota2) / 2;
	
	if(media >= 7 ) {
		System.out.printf("Sua média foi %2.1f. Portanto parabéns, você foi aprovado!", media);
	} else if(media < 7 && media > 4) {
		System.out.printf("Sua média foi %2.1f. Não desista, você ficou de recuperação!", media);
	} else {
		System.out.printf("Sua média foi %2.1f. Lamentamos informar, você foi reprovado!", media);
	}
}
}

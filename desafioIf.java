package exercicios;
import java.util.Scanner;

public class desafioIf {
	 public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	        
	        String dia;
	        
	        System.out.println("Digite um dia!");
	        dia = ler.next();	
	        
	        if(dia.equalsIgnoreCase("domingo")) {
	        	System.out.println("Dia 1");
	        } else if(dia.equalsIgnoreCase("segunda")) {
	        	System.out.println("Dia 2");
	        } else if(dia.equalsIgnoreCase("terça")) {
	        	System.out.println("dia 3");
	        } else if(dia.equalsIgnoreCase("quarta")) {
	        	System.out.println("dia 4");
	        } else if(dia.equalsIgnoreCase("quinta")) {
	        	System.out.println("Dia 5");
	        } else if(dia.equalsIgnoreCase("sexta")) {
	        	System.out.println("Dia 6");
	        } else if(dia.equalsIgnoreCase("sabado")) {
	        	System.out.println("Dia 7");
	        }
	 }
}

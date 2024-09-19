package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class desafioArrays {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantas notas serão?");
        int numNotas = ler.nextInt();
        double[] notas = new double[numNotas];

        for(int i = 0; i < notas.length; i++){
            System.out.printf("Infome a %d° nota: ", i+1);
            notas[i] = ler.nextDouble();
        }

        double total = 0;
        for(double nota : notas){
            total += nota;
        }

        double media = total/numNotas;

        System.out.printf("A média da turma é: %2.2f", media);
    }
}

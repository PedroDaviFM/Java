import java.util.Scanner;

public class elevar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a;
        System.out.println("Digite um número:\n");
        a = ler.nextInt();
        System.out.println(Math.pow(a, 2) + "\n");
        System.out.println(Math.pow(a, 3) + "\n");
    }
}

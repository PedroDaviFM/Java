import java.util.Scanner;
public class converte {
    public static void main(String[] args) {
        String salA;
        String salB;
        String salC;
        double a;
        double b;
        double c;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um salário");
        salA = ler.nextLine();
        System.out.println("Digite um salário");
        salB = ler.nextLine();
        System.out.println("Digite um salário");
        salC = ler.nextLine();

        a = Double.valueOf(salA).doubleValue();
        b = Double.valueOf(salB).doubleValue();
        c = Double.valueOf(salC).doubleValue();

        double media = (a + b + c)/3;

        System.out.println(media);
    }
}

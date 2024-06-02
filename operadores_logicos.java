import java.util.Scanner;
public class operadores_logicos {
    public static void main(String[] args) {
        boolean trabalho1;
        boolean trabalho2;
        Scanner ler = new Scanner(System.in);

        System.out.println("Você entregou o trabalho de terça-feira?");
        trabalho1 = ler.nextBoolean();
        System.out.println("Também tinha o trabalho de quinta, você conseguiu entragar?");
        trabalho2 = ler.nextBoolean();

        if (trabalho1 == true && trabalho2 == true){
            System.out.println("parabéns, você poderá ir ao shopping comprar uma tv de 50 polegadas e comprar um sorvete");
        }else if(trabalho1 == true && trabalho2 == false || trabalho1 == false && trabalho2 == true){
            System.out.println("parabéns, você poderá ir ao shopping, comprar uma tv de 32 polegadas e tomar um sorvete");
        }else {
            System.out.println("infelizmente você não entregou seus trabalhos, logo não poderá ir ao shopping");
        }
    }
}

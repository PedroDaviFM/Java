public class operadores_aritimeticos {
    public static void main(String[] args){
        int a = 6 * (3 + 2);
        int b = 3*2;
        int c = (1 - 5) * (2-7) / 2;
        int e = 10;

        System.out.println("resolução do desafio!");
        int d = (int) Math.pow(a, 2);
        int h = d/b;
        System.out.println(h);
        int f = (int) Math.pow(c, 2);
        System.out.println(f);
        int i = h - f;
        System.out.println(i);
        int g = (int)Math.pow(i, 3);
        int j = (int) Math.pow(e, 3);
        System.out.println(g/j);

    }
}

package Classe;
public class produtoTeste {
public static void main(String[] args) {
	produto p1 = new produto();
	p1.nome = "Borracha";
	p1.preco = 0.50;
	p1.desconto = 0.20;
	
	produto p2 = new produto();
	p2.nome = "notebook";
	p2.preco = 4356.99;
	p2.desconto = 0.2;
	
	System.out.println(p1.nome);
	System.out.println(p2.nome);
	
	double precoFinal1 = p1.preco*(1-p1.desconto);
	double precoFinal2 = p2.preco*(1-p2.desconto);
	double totalPagar = precoFinal1 + precoFinal2;
	
	System.out.println("Total a ser pago: " + totalPagar);
}
}

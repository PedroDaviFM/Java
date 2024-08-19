package Classe;
public class areaCircunferencia {
	
	double pi = 3.14;
	double raio;
	public areaCircunferencia(double raio1){
		raio = raio1;
	}
	double area() {
		return raio*raio*pi;
	}
}

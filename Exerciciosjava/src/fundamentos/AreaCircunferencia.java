package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		double raio = 3.4; // variavel
		double Pi = 3.14159; // variavel
		
		
		double area = Pi * raio * raio;
		System.out.println(area);
		
		raio = 10; // constante
		area = Pi * raio * raio; // constante
		System.out.println( "Area = "+ area + "m2." );
		
	}

}

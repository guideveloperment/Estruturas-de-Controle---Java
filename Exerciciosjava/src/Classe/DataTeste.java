package Classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		
		Data d2 = new Data(31, 12, 2020);
		
		String dataFormatada1 = d1.obterDataFormatada();
						
		System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
		System.out.printf("%d/%d/%d\n", d2.dia, d2.mes, d2.ano);
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
	}
}

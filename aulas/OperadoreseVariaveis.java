package aulas;

public class OperadoreseVariaveis {
	public static void main(String[] args) {
		int quantidade = 1000;
		long identificador = 10000l;
		float altura = 25.4f;
		double area = 45.4567;
		double tamanho = 650000000.00;
		char tipo = 'A';
		String palavra = "Generation";
		
		System.out.printf("Variável quantidade = %d \n", quantidade);
		System.out.printf("Variável identificador = %d\n", identificador);
		System.out.printf("Variável altura = %.2f \n", altura);
		System.out.printf("Variável area %.2f \n", area);
		System.out.printf("Variável tamanho %e \n", tamanho);
		System.out.printf("Variável tamanho %E \n", tamanho);
		System.out.printf("Variável tipo %c \n", tipo);
		System.out.printf("Variável palavra %s\n", palavra);
		
		System.out.println("texto" + palavra);
		
		System.out.println("texto");
	}
}

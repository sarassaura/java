package aulas;

public class metodos {

	public static void main(String[] args) {
		int resultado;
		
		resultado = soma(4, 2);
		
		System.out.println(resultado);
		
		mensagem();

	}

	private static int soma(int i, int j) {
		return i + j;
	}
	
	public static void mensagem() {
		System.out.println("Mensagem sem retorno");
	}

}

package lacoscondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int num;
		String mensagem = "O Número ";
		
		System.out.printf("Digite um número: ");
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		mensagem += num;
		
		if(num % 2 == 0) {
			mensagem += " é par ";
		} else {
			mensagem += " é ímpar ";
		}
		
		if(num >= 0) {
			mensagem += "e positivo!";
		} else {
			mensagem += "e negativo!";
		}
		
		System.out.println(mensagem);
		
		sc.close();
	}

}

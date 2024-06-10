package lacoscondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int a,b,c, soma;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o número A: ");
		a = sc.nextInt();
		
		System.out.printf("Digite o número B: ");
		b = sc.nextInt();
		
		System.out.printf("Digite o número C: ");
		c = sc.nextInt();
		
		soma = a+b;
		
		if(soma > c) {
			System.out.printf("\n%d + %d = %d > %d", a, b, soma, c);
			System.out.printf("\nA Soma de A + B é Maior do que C");
		} else if (soma < c) {
			System.out.printf("\n%d + %d = %d < %d", a, b, soma, c);
			System.out.printf("\nA Soma de A + B é Menor do que C");
		} else {
			System.out.printf("\n%d + %d = %d = %d", a, b, soma, c);
			System.out.printf("\nA Soma de A + B é Igual a C");
		}
		
		sc.close();
	}

}

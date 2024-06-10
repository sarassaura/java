package operadoresevariaveis;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float n1, n2, n3, n4, media;
		
		System.out.printf("Digite a Nota 1: ");
		n1 = sc.nextFloat();
		
		System.out.printf("Digite a Nota 2: ");
		n2 = sc.nextFloat();
		
		System.out.printf("Digite a Nota 3: ");
		n3 = sc.nextFloat();
		
		System.out.printf("Digite a Nota 4: ");
		n4 = sc.nextFloat();
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.printf("\nMédia final: %.1f", media);

		sc.close();
	}

}

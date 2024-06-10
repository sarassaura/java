package operadoresevariaveis;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float n1, n2, n3, n4, diferenca;
		
		System.out.println("Digite o número 1: ");
		n1 = sc.nextFloat();
		
		System.out.println("Digite o número 2: ");
		n2 = sc.nextFloat();
		
		System.out.println("Digite o número 3: ");
		n3 = sc.nextFloat();
		
		System.out.println("Digite o número 4: ");
		n4 = sc.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.printf("\nDiferença: %.1f", diferenca);
		
		sc.close();	
	}
}

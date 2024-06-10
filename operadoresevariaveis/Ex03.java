package operadoresevariaveis;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float salario_bruto, adicional_noturno, horas_extras, descontos, salario_liquido;
		
		System.out.printf("Digite o Salário Bruto: ");
		salario_bruto = sc.nextFloat();

		System.out.printf("Digite o Adicional Noturno: ");
		adicional_noturno = sc.nextFloat();
		
		System.out.printf("Digite as Horas Extras: ");
		horas_extras = sc.nextFloat();
		
		System.out.printf("Digite os Descontos do Colaborador: ");
		descontos = sc.nextFloat();
		
		salario_liquido = salario_bruto + adicional_noturno + (horas_extras * 5) - descontos;
		
		System.out.printf("\nSalário Líquido: %.2f", salario_liquido);
		
		sc.close();
	}

}

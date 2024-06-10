package lacoscondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String nome_colaborador, cargo = "";
		int codigo_cargo_colaborador;
		float salario, novo_salario = 0f;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o Nome do colaborador: ");
		nome_colaborador = sc.nextLine();
		
		System.out.printf("Digite o Cargo: ");
		codigo_cargo_colaborador = sc.nextInt();
		
		System.out.print("Digite o Salário: ");
		salario = sc.nextFloat();
		
		switch(codigo_cargo_colaborador) {
		case 1:
			novo_salario = salario * 1.10f;
			cargo = "Gerente";
			break;
		case 2:
			novo_salario = salario * 1.07f;
			cargo = "Vendedor";
			break;
		case 3:
			novo_salario = salario * 1.09f;
			cargo = "Supervisor";
			break;
		case 4:
			novo_salario = salario * 1.06f;
			cargo = "Motorista";
			break;
		case 5:
			novo_salario = salario * 1.05f;
			cargo = "Estoquista";
			break;
		case 6:
			novo_salario = salario * 1.08f;
			cargo = "Técnico de TI";
			break;
		}
		
		System.out.printf("\nNome do colaborador: %s", nome_colaborador);
		System.out.printf("\nCargo: %s", cargo);
		System.out.printf("\nSalário: R$ %.2f", novo_salario);
		sc.close();
	}

}

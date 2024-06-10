package lacosderepeticao;

import java.util.Locale;
import java.util.Scanner;

/*
 * Uma empresa desenvolveu uma pesquisa interna 
 * para conhecer os colaboradores da área de 
 * Desenvolvimento e precisam de um sistema para 
 * analisar os dados. Escreva um algoritmo em Java, 
 * que leia via teclado as seguintes informações 
 * de cada colaborador:
 * Idade (Número inteiro)
 * Identidade de Gênero (Número Inteiro): 
 *   1 – Mulher Cis
 *   2 – Homem Cis
 *   3 – Não Binário
 *   4 – Mulher Trans
 *   5 – Homem Trans
 *   6 – Outros
 * Pessoa Desenvolvedora (Número Inteiro):
 *   1 – Backend
 *   2 – Frontend
 *   3 – Mobile
 *   4 – FullStack
 *   Após digitar a categoria, o sistema 
 *   deverá perguntar ao usuário se ele 
 *   deseja continuar a leitura dos dados 
 *   de um novo colaborador ou não (S/N). 
 *   Caso seja pressionada a tecla N, mostre na tela:
 *   O número de pessoas desenvolvedoras Backend
 *     O número de Mulheres Cis e Trans desenvolvedoras Frontend
 *     O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos
 *     O número de Não Binários desenvolvedores FullStack menores de 30 anos
 *     O número total de pessoas que responderam à pesquisa
 *     A média de idade das pessoas que responderam à pesquisa
*/

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int idade, genero, desenvolvedora, backend = 0, mulheres = 0, homens = 0, naoBinarios = 0, total = 0;
		char p = 'S';
		float  mediaIdade = 0;
		
		while(p == 'S') {
			System.out.printf("Idade: ");
			idade = sc.nextInt();
			System.out.println("\nIdentidade de Gênero: ");
			System.out.println("1 – Mulher Cis");
	        System.out.println("2 – Homem Cis");
	        System.out.println("3 – Não Binário");
	        System.out.println("4 – Mulher Trans");
	        System.out.println("5 – Homem Trans");
	        System.out.println("6 – Outros");
	        System.out.print("Escolha o número correspondente: ");
			genero = sc.nextInt();
			System.out.println("\nPessoa Desenvolvedora: ");
	        System.out.println("1 – Backend");
	        System.out.println("2 – Frontend");
	        System.out.println("3 – Mobile");
	        System.out.println("4 – FullStack");
	        System.out.print("Escolha o número correspondente: ");
			desenvolvedora = sc.nextInt();
			
			System.out.printf("\nDeseja Continuar (S/N): ");
			p = Character.toUpperCase(sc.next().charAt(0));
			
			total++;
			mediaIdade += idade;
			
			if(desenvolvedora == 1) {
				backend++;
			}
			
			if(desenvolvedora == 2 && (genero == 1 || genero == 4)) {
				mulheres++;
			}
			
			if(desenvolvedora == 3 && (genero == 2 || genero == 5) && idade > 40) {
				homens++;
			}
			
			if(desenvolvedora == 4 && genero == 3 && idade < 30) {
				naoBinarios++;
			}
			System.out.print("\n\n");
		}
		
		mediaIdade /= total;
		
		System.out.printf("\nTotal de pessoas desenvolvedoras Backend: " + backend);
		System.out.printf("\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulheres);
		System.out.printf("\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homens);
		System.out.printf("\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + naoBinarios);
		System.out.printf("\nO número total de pessoas que responderam à pesquisa: " + total);
		System.out.printf("\nA média de idade das pessoas que responderam à pesquisa: %.2f", mediaIdade);
		
		
		sc.close();
	}

}

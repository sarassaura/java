package aulas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		// tipo_de_dado nome_vetor[] = {v1,v2,v3,...,vn};
		// tipo_de_dado nome_vetor[] = new tipo_de_dado[tamanho];
		// String vetorNomes[] = {"charlote", "latoya", "raul"};
		// float vetorRealSalario[] = new float[5];
		// vetorRealSalario[indice];

		String vetorLivros[] = { "pai rico pai pobre", "o homem mais rico da babilonia", "o pequeno principe",
				"nao sobrou nenhum" };
		System.out.println("1º elemento: " + vetorLivros[0]);
		System.out.println("2º elemento: " + vetorLivros[1]);
		System.out.println("3º elemento: " + vetorLivros[2]);
		System.out.println("4º elemento: " + vetorLivros[3]);

		int vetorInteiro[] = new int[5];
		Scanner leia = new Scanner(System.in);

		for (int indice = 0; indice < 5; indice++) {
			System.out.println("Digite o " + (indice + 1) + "º Número: ");
			vetorInteiro[indice] = leia.nextInt();
		}
		System.out.println("Os números digitados foram: \n");

		for (int indice = 0; indice < 5; indice++) {
			System.out.println((indice + 1) + "º número " + vetorInteiro[indice]);
		}

		System.out.println("\n\nLivros dentro do vetor: \n");

		for (int indice = 0; indice < vetorLivros.length; indice++) {
			System.out.println(vetorLivros[indice]);
		}
		
		System.out.println("O tamanho do seu vetor é: " + vetorLivros.length);

		String array_nomes[] = {"Samantha", "Amanda", "Vinicius", "Cauê", "Leonardo"};

        Arrays.sort(array_nomes);
        
        System.out.println("Array em Ordem Crescente \n");
        for(int indice = 0; indice < array_nomes.length; indice++) {
            System.out.println(array_nomes[indice]);    
        }
        
        Arrays.sort(array_nomes, Collections.reverseOrder());
        
        System.out.println("\nArray em Ordem Decrescente \n");
        for(int indice = 0; indice < array_nomes.length; indice++) {
            System.out.println(array_nomes[indice]);    
        }
		
		leia.close();

	}

}

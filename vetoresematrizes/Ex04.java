package vetoresematrizes;

import java.util.Locale;
import java.util.Scanner;

/*
 * Elabore um algoritmo que leia as notas de uma classe 
 * com 10 participantes durante 4 bimestres de um ano. 
 * As 4 notas de cada participante serão armazenadas em 
 * uma linha de uma matriz de números reais, logo cada 
 * linha da matriz serão as notas de um participante. 
 * Em um vetor de números reais, armazene as médias de 
 * cada participante e exiba as médias de cada um na tela.
 */

public class Ex04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float notas[][] = new float[10][4];
		float media[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("Digite o valor da posicao [%d][%d]: ", i, j);
				notas[i][j] = sc.nextFloat();
				media[i] += notas[i][j];
			}
			media[i] /= 4;
		}
		
		System.out.print("\n| ");
		
		for(float aluno : media) {
			System.out.printf("%.1f | ", aluno);
		}

		sc.close();
	}

}

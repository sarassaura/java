package aulas;

public class Operadores {
	public static void main(String[] args) {
		int x = 4;
		int y = 2;
		int z = 3;
		int w = -5;

		System.out.println("Soma (4+2): " + (x + y));
		System.out.println("\nSoma com número negativo (4 + (-5)): " + (x + w));
		System.out.println("\nSubtracao (4 - 2)): " + (x - y));
		System.out.println("\nMultiplicação (4 * 2): " + (x * y));
		System.out.println("\nDivisão (4 / 2): " + (x / y));
		System.out.println("\nMódulo (resto da divisão): " + (x % 2));
		System.out.println("\nMódulo (resto da divisão): " + (z % 2));

		String texto01 = "Generation";
		String texto02 = "Brasil";
		String texto03 = " ";

		System.out.println("\n\nConcatenar texto01 e texto02: " + texto01 + texto02);
		System.out.println("\nConcatenar texto02 e texto01: " + texto02 + texto01);
		System.out.println("\nConcatenar texto01, texto03 e texto02: " + texto01 + texto03 + texto02);

		x = 10;
		y = 8;
		z = 6;
		w = 4;
		int i = 40;
		int j = 30;
		int k = 20;
		int l = 10;
		int m = 5;

		System.out.println("\nTransformar em Número negativo " + (-m));
		System.out.println("\nPré Incrementar: x = ++ y");

		x = ++y;

		System.out.println("\nValor de X: " + x);
		System.out.println("\nValor de Y: " + y);

		System.out.println("\nPré Decrementar: z = -- w");

		z = --w;

		System.out.println("\nValor de Z: " + z);
		System.out.println("\nValor de W: " + w);

		System.out.println("\nPós Incrementar: i = j ++");

		i = j++;

		System.out.println("\nValoe de I: " + i);
		System.out.println("\nValoe de J: " + j);

		System.out.println("\nPré Decrementar: k = l --");

		k = l--;

		System.out.println("\nValor de K: " + k);
		System.out.println("\nValor de L: " + l);

		x = 4;
		y = 2;
		z = 1;

		z = y;
		System.out.println("\n\nAtribuição simples (z = y): " + z);

		x += y;
		System.out.println("\nAtribuição com soma (x = x + y): " + x);

		x -= z;
		System.out.println("\nAtribuição com subtração (x = x - z) " + x);

		x *= y;
		System.out.println("\nAtribuição com multiplicação (x = x * y) " + x);

		x /= y;
		System.out.println("\nAtribuição com divisão (x = x / y) " + x);

		x %= y;
		System.out.println("\nAtribuição com divisão (x = x % y) " + x);

		x = 10;
		y = 5;
		z = 20;
		w = 5;
		boolean resposta;

		resposta = x > y;
		System.out.println("O valor de x é maior que o valor de y? " + resposta);

		resposta = z >= y;
		System.out.println("O valor de z é maior ou igual que o valor de y? " + resposta);

		resposta = x < z;
		System.out.println("O valor de x é menor que o valor de z? " + resposta);

		resposta = z <= w;
		System.out.println("O valor de z é menor ou igual que o valor de w? " + resposta);

		resposta = x == z;
		System.out.println("O valor de x é igual ao valor de z? " + resposta);

		resposta = z != w;
		System.out.println("O valor de z é diferente do valor de y? " + resposta);

		x = 10;
		y = 5;
		boolean proposicao_01;
		boolean proposicao_02;
		boolean proposicao_03;
		boolean proposicao_04;

		proposicao_01 = x > y;
		System.out.println("\nA proposicao_01 é: " + proposicao_01);

		proposicao_02 = x < y;
		System.out.println("\nA proposicao_02 é: " + proposicao_02);

		proposicao_03 = x != y;
		System.out.println("\nA proposicao_03 é: " + proposicao_03);

		proposicao_04 = x == y;
		System.out.println("\nA proposicao_04 é: " + proposicao_04);

		System.out.println("\n\nConjucao\n");

		resposta = proposicao_01 && proposicao_03;
		System.out.println("\nA proposicao_01 e proposicao_03 são verdadeiras?: " + resposta);

		resposta = proposicao_02 && proposicao_04;
		System.out.println("\nA proposicao_02 e proposicao_04 são verdadeiras?: " + resposta);

		resposta = proposicao_01 && proposicao_02;
		System.out.println("\nA proposicao_01 e proposicao_02 são verdadeiras?: " + resposta);

		resposta = proposicao_03 && proposicao_04;
		System.out.println("\nA proposicao_03 e proposicao_04 são verdadeiras?: " + resposta);

		System.out.println("\n\nDisjuncao\n");

		resposta = proposicao_01 || proposicao_03;
		System.out.println("\nA proposicao_01 ou proposicao_03 são verdadeiras?: " + resposta);

		resposta = proposicao_02 || proposicao_04;
		System.out.println("\nA proposicao_02 ou proposicao_04 são verdadeiras?: " + resposta);

		resposta = proposicao_01 || proposicao_02;
		System.out.println("\nA proposicao_01 ou proposicao_02 são verdadeiras?: " + resposta);

		resposta = proposicao_03 || proposicao_04;
		System.out.println("\nA proposicao_03 ou proposicao_04 são verdadeiras?: " + resposta);

		System.out.println("\n\nNegacao\n");

		proposicao_01 = x > y;
		System.out.println("\nA proposicao_01 é: " + proposicao_01);
		
		proposicao_02 = x < y;
		System.out.println("\nA proposicao_02 é: " + proposicao_01);
	
		resposta = !proposicao_01;
		System.out.println("\nA negacao da proposicao_01 é: " + resposta);
		
		resposta = !proposicao_02;
		System.out.println("\nA negacao da proposicao_02 é: " + resposta);
	}
}

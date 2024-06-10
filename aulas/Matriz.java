package aulas;

public class Matriz {
	public static void main(String[] args) {
		// tipo_de_dado nome_da_matriz[][]= {{v1,v2,v3}, {v4,v5,v6}, {v7,v8,v9}
		// tipo_de_dado nome_da_matriz[][] = new tipo_de_dado[numero_linhas][numero_colunas];
		
		int matrizInteiros[][] = {{10,15,35}, {70,120,140}, {50,100,150}};
		
		for(int indiceLinha = 0; indiceLinha < 3; indiceLinha++) {
			for(int indiceColuna = 0; indiceColuna < 3; indiceColuna++) {
				System.out.println("O valor armazenado na posição [" + indiceLinha + "][" + indiceColuna + "] é: " + matrizInteiros[indiceLinha][indiceColuna]);
			}
		}
 	}
}

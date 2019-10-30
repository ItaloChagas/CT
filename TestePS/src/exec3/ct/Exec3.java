package exec3.ct;

import java.util.Scanner;

public class Exec3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] codProd = new int [10];
		double[] precoProd = new double [10];
		int[][] qtdEst = new int[5][10];
		int codPesquisa;

		int opcao;

		for(int i = 0; i<10; i++) {
			System.out.println("Informe o código do " +i+ "° produto" );
			codProd[i] = sc.nextInt();
		}

		for(int i = 0; i<10; i++) {
			System.out.println("Informe o preço do prduto " +codProd[i] +" :" );
			precoProd[i] = sc.nextInt();
		}

		for(int i=0; i< 5; i++) {
			System.out.println("Informe o código do " +i +"° armazem: ");
			qtdEst[i][0] = sc.nextInt();
		}

		for(int i =0; i<5; i++){
			for(int j = 1; j<10; j++) {
				System.out.println("Informe o estoque do produto " + codProd[j] + " para o armazem " + qtdEst[i][0]);
				qtdEst[i][j] = sc.nextInt();

			} 
		}



		do{
			System.out.println("1 - Calcular");
			System.out.println("2 - Pesquisar");
			System.out.println("3 - Listar");
			System.out.println("4 - Sair");
			opcao = sc.nextInt();

		}while(opcao <1 || opcao > 4);



		switch(opcao) {

		case 1:

			calcular(precoProd,codProd,qtdEst);

		case 2:
			System.out.println("Informe o código do produto: ");
			codPesquisa = sc.nextInt();
			pesquisar(codPesquisa, precoProd,codProd,qtdEst);
			
		case 3:
			
			ordenar(precoProd,codProd);
			
		case 4:

			break; 

		}
	}


	private static void ordenar(double[] precoProd, int[] codProd) {

			int menor_indice_cod=0, menor_indice_val=0;
			int menor_cod=0; 
			double menor_valor=0;
			int aux=0;
			
			for(int i =0; i <codProd.length -1; i++) {
				menor_indice_cod=i;
				menor_cod=codProd[i];
				menor_valor= precoProd[i];
				
				for(int j =i +1; j<codProd.length; j++) {
					if(codProd[j] < menor_cod ) {
						aux = codProd[j];
						codProd[j] = menor_cod;
						menor_cod = aux; 
					}
				}
			}
	}


	private static void pesquisar(int codPesquisa, double[] precoProd, int[] codProd, int[][] qtdEst) {
		
		for(int i =0; i< 10; i++){
			if (codPesquisa == codProd[i]) {				
				
				for(int x = 0; x<5; x++) {
									
					System.out.println("Qauntidade de Estoque no armazem: " + qtdEst[x][0] + 
							" é " + qtdEst[x][i] );	
					break;
				}
			}
		}
		
		System.out.println("Produto não encontrado");		
	}


	public static void calcular(double precoProd[], int codProd[], int qtdEst[][]) {

		int[] somaTotalEst = new int[5];
		int[] somaTotalVal = new int[5];
		for(int i =0; i< 5; i++){
			for(int j =0; j <10; j ++) {
				somaTotalEst[i] += qtdEst[i][j];
				somaTotalVal[i] += precoProd[j] * qtdEst[i][j];
			}
		}
		for(int i =0; i< 5; i++){
			for(int j =0; j <10; j ++) {
				System.out.println("Quantidade de produtos no armazem " + qtdEst[i][0] + " é: " + somaTotalEst[i]);
				System.out.println("Valor em produtos do armazem " + qtdEst[i][0] + " é: " + somaTotalVal[i]);

			}
		}
	}
}
package exec3.ct;

import java.util.Scanner;

public class Exec3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] codProd = new int [10];
		double[] precoProd = new double [10];
		int[][] qtdEst = new int[5][10];
		
		for(int i = 0; i<10; i++) {
			System.out.println("Informe o c�digo do " +i+ "� produto" );
			codProd[i] = sc.nextInt();
		}
		
		for(int i = 0; i<10; i++) {
			System.out.println("Informe o pre�o do prduto " +codProd[i] +" :" );
			precoProd[i] = sc.nextInt();
		}
		
		for(int i=0; i< 5; i++) {
			System.out.println("Informe o c�digo do " +i +"� armazem: ");
			qtdEst[i][0] = sc.nextInt();
		}
		
		for(int i =0; i<5; i++){
		  for(int j = 1; j<10; j++) {
			  System.out.println("Informe o estoque do produto " + codProd[j] + " para o armazem " + qtdEst[i][0]);
			  qtdEst[i][j] = sc.nextInt();
		  
		  } 
		}
		
		
		
		 
	}

}

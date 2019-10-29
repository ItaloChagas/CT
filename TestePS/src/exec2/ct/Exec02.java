package exec2.ct;

public class Exec02 {

	public static void main(String[] args) {

		int[] vetor = {2,345,44,33,5,7,6,5,1,66};
		
		selectionSort(vetor);
	}
	
	public static void selectionSort(int vetor[]) {
		int maior_valor, maior_indice;
		for(int i =0; i<vetor.length-1; i++) {
			maior_valor = vetor[i];
			maior_indice = i;
		
			for(int j = i+1; j<vetor.length; j++) {
				if(vetor[j] > maior_valor) {
					maior_valor= vetor[j];
					maior_indice=j;
				}
			}
			vetor[maior_indice] = vetor[i];
			vetor[i] = maior_valor;
		}
		for(int i =0; i<vetor.length; i++) {
		
			System.out.println(vetor[i]);
		}
	}
}

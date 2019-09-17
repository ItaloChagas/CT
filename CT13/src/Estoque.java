import java.util.Scanner;

public class Estoque {

	public Estoque(int tam_vetor) {
		
		this.tam_vetor = tam_vetor;
		
	}
	
	
	static Scanner sc = new Scanner(System.in);

	int cod_peca, qtde_estoque, est_min;

	static int tam_vetor;
	double valor_uni;
	String desc_peca;
	
	static int[] vet_cod_peca = new int[tam_vetor];
	static int[] vet_qtde_estoque = new int[tam_vetor];
	static int[] vet_est_min = new int[tam_vetor];
	static double[] vet_valor_uni = new double[tam_vetor];
	static String[] vet_desc_peca = new String[tam_vetor];

	public static String cadastrar() {

		
		for(int i =0; i < tam_vetor; i++) {
			
			System.out.println("Informar codigo da peca");
			vet_cod_peca[i] = sc.nextInt();
			System.out.println("Informar quantidade em estoque");
			vet_qtde_estoque[i] = sc.nextInt();
			System.out.println("Informar estoque minimo");
			vet_est_min[i] = sc.nextInt();	
			System.out.println("Informar o valor");
			vet_valor_uni[i] = sc.nextInt();
			System.out.println("Informar descricao simples da peca");
			vet_desc_peca[i] = sc.next();
		}
		return " cadastrada com sucesso!"; 
	}
	
	
	public static String vender(int cod_produto, int qtd) {
		
		for(int i =0; i < tam_vetor ; i++) {
			if(vet_cod_peca[i] == cod_produto) {
				if(vet_qtde_estoque[i] > qtd + 10) {
					vet_qtde_estoque[i] -= qtd;
				}else {
					
					return "Estoque insuficiente. Estoque: " + vet_qtde_estoque[i];
				}
			}else {
				return "Peça não existe no estoque";
			}
		}		
		return "Produto vendido";
	}

}

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cod_peca, qtde_estoque, est_min, tam_vetor;
		double valor_uni;
		String desc_peca;
		
		
		System.out.println("Qual a capacidade do seu estoque?");
		tam_vetor = sc.nextInt();
		
		System.out.println("SELECIONE UMA DAS OPCOES ABAIXO");
		System.out.println("-1 cadastrar");
		System.out.println("-2 vender");
		System.out.println("-3 comprar");
		System.out.println("-4 listar");
		System.out.println("-5 sair ");
		int opcao = sc.nextInt();
		
		Estoque estoque = new Estoque(tam_vetor);
		
		switch(opcao) {
		
		case 1: 
			
			Estoque.cadastrar();
		
		case 2:
			
			System.out.println("Qual o codigo do produto?");
			Estoque.vender(sc.nextInt());
			
		
		}
		
		
		
		
	}

}

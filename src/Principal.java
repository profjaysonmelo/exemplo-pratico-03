
public class Principal {

	public static void main(String[] args) {
		
		CartaoEmbarque cartao = new CartaoEmbarque();
		cartao.setNomePassageiro("Jo�o Paulo");
		cartao.setCompanhiaAerea("Gol");
		cartao.setNumeroAssento(221);
		
		System.out.println("Nome: " + cartao.getNomePassageiro());
		System.out.println("Companhia Aerea: " + cartao.getCompanhiaAerea());
		System.out.println("N�mero Assento:" + cartao.getNumeroAssento());
		
	}
	
}

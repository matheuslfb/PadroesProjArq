package Model;
import Interface.Cliente;

public class ClientePadrao implements Cliente {

	private String nome, cartao;
	private boolean seguro;
	private int idade;
	
	public ClientePadrao(String nome, String cartao, boolean seguro, int idade) {
		// TODO Auto-generated constructor stub
		this.cartao = cartao;
		this.nome = nome;
		this.seguro = seguro;
		this.idade = idade;
				
	}

	public String getNome() {
		// TODO Auto-generated method stub
		return this.nome;
	}

	@Override
	public String getCartao() {
		// TODO Auto-generated method stub
		return this.cartao;
	}

	@Override
	public boolean temSeguro() {
		// TODO Auto-generated method stub
		return this.seguro;
	}

	@Override
	public int getIdade() {
		// TODO Auto-generated method stub
		return this.idade;
	}

}

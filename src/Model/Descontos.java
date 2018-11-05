package Model;
import Interface.Cliente;

public class Descontos {

	private int desconto;

	public Descontos(int desconto) {
		this.desconto = desconto;

	}

	public boolean maiorIdade(Cliente p) {
		if (p.getIdade() > 65) {
			return true;
		} else
			return false;
	}
}

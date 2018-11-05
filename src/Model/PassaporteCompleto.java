package Model;
import java.util.GregorianCalendar;

import Interface.Passaporte;

public class PassaporteCompleto implements Passaporte {

	private String nomeCliente;
	private int nroDias;
	private double valorBasico;
	private GregorianCalendar dataInicial;

	public PassaporteCompleto(String umCliente, int umNroDias, double umValorBasico, int dia, int mes, int ano) {
		nomeCliente = umCliente;
		nroDias = umNroDias;
		valorBasico = umValorBasico;
		dataInicial = new GregorianCalendar(ano, mes, dia);
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public int getNroDias() {
		return nroDias;
	}

	public double valorBasico() {
		return valorBasico;
	}

	public GregorianCalendar dataInicial() {
		return (GregorianCalendar) dataInicial.clone();
	}

	public double valorDoDia(int nrodia) {
		double valorDia = valorBasico();
		for (int i = 0; i < nrodia - 1; i++) {
			valorDia = valorDia - (valorDia * 0.2);
		}
		return valorDia;
	}

	public double valorTotal() {
		double valorTotal = 0.0;
		for (int d = 1; d <= getNroDias(); d++) {
			valorTotal += valorDoDia(d);
		}
		return valorTotal;
	}
}

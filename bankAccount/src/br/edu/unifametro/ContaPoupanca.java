package br.edu.unifametro;

public class ContaPoupanca extends ContaBancaria {

	public double taxaDeJuros;

	public ContaPoupanca(double taxaDeJuros) {
		
		super(0.0f);
		this.taxaDeJuros = taxaDeJuros;
		
	}
	
	public void adicionaJuros() {
		
		double juros = getSaldo() * taxaDeJuros / 100;
		depositoSaldo(juros);
		
	}
	
}

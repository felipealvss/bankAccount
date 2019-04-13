package br.edu.unifametro;

public class ContaBancaria {

	private double saldo;

	//CONSTRUCT
	public ContaBancaria(double sal) {
		
		this.saldo = sal;
		
	}

	//GETTER & SETTER
	public double getSaldo() {
		
		return saldo;
		
	}
	public void setSaldo(double saldo) {
		
		this.saldo = saldo;
		
	}
	
	//DEPOSITO
	public void depositoSaldo(double deposito) {
		if (deposito <= 0) {
			
			System.out.println("Operação INVÁLIDA!");
			
		} else {
			
			setSaldo(getSaldo() + deposito); 
			System.out.printf("Operação REALIZADA!%nSaldo atual: %.2f", getSaldo());
			
		}
	}
	
	//SAQUE
	public void saqueSaldo(double saque) {
		
		if (getSaldo() < 0 || saque > getSaldo()) {
			
			System.out.println("Operação INVÁLIDA!");
			
		} else {
			
			setSaldo(getSaldo() - saque);
			System.out.printf("Operação REALIZADA!%nSaldo atual: %.2f", getSaldo());
			
		}
	}
	
}

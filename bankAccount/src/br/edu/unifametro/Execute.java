package br.edu.unifametro;

import java.util.Scanner;

public class Execute {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		ContaBancaria c1;
		c1 = new ContaBancaria(500.00);
		
		System.out.println("++++++++++ Início de operação ++++++++++");

		System.out.println();
		System.out.println("Conta iniciada!");
		System.out.println("Valor inicial de saldo: " + c1.getSaldo());
		System.out.println();
		
		System.out.printf("Escolha a opção: %n[1] Depósito: %n[2] Saque: %n[9] Abrir CONTA POUPANÇA: %n");
		int opc = read.nextInt();
			
			switch (opc) {
			case 1:

				System.out.print("Digite valor para depósito: ");
				double valDep = read.nextDouble();
				c1.depositoSaldo(valDep);
				
				break;
			
			case 2:

				System.out.print("Digite valor para saque: ");
				double valSaq = read.nextDouble();
				c1.saqueSaldo(valSaq);
				
				break;
				
			case 9:
				
				ContaPoupanca cp;
				
				System.out.println();
				System.out.println("Conta poupança aberta!");
				
				System.out.println();
				System.out.printf("Deseja informar juros para conta?[S/N]: %n(A não informação implicará em juros padrão de 12%)");
					String optJurSouN = read.next();
					
					if (optJurSouN == "S") {
						
						System.out.println();
						System.out.print("Informe a taxa de juros desejada: ");
						double taxJur = read.nextDouble();
						
						cp = new ContaPoupanca(taxJur);
						
					} else {
						
						System.out.println();
						System.out.println("Juros padrão aplicado!");
						cp = new ContaPoupanca(12);
						
					}
				
				System.out.println();
				System.out.print("Deseja adicionar juros? [S/N] ");
//					read.next();
				String opt = read.next();
					if (opt == "S") {
						
						cp.adicionaJuros();
						
						System.out.println();
						System.out.println("Juros adicionado!");
						System.out.println("Saldo atual: " + cp.getSaldo());
						
					} else if (opt == "N") {
						System.out.println("Fim de operação em poupança!");
					}
				
				break;
				
			default:
				
				System.out.println("Operação INVÁLIDA!");
				
				break;
			}

		read.close();
		
		System.out.println();
		System.out.println("++++++++++++ Fim de operação ++++++++++++");
	}

}

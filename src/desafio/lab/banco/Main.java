package desafio.lab.banco;

import desafio.lab.banco.model.Cliente;
import desafio.lab.banco.model.Conta;
import desafio.lab.banco.model.ContaCorrente;
import desafio.lab.banco.model.ContaPoupanca;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(new BigDecimal("100.0"));
		cc.transferir(new BigDecimal("100.0"), poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}

package desafio.lab.banco.model;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato desafio.lab.banco.model.Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
}

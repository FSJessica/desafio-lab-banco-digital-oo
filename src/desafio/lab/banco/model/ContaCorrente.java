package desafio.lab.banco.model;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato desafio.lab.banco.model.Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}

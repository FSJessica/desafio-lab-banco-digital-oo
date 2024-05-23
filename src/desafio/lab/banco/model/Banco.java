package desafio.lab.banco.model;

import lombok.*;

import java.util.List;

@Setter
@Getter
public class Banco {

	private String nome;
	private List<Conta> contas;

}

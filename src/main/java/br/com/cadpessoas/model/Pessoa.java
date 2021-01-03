package br.com.cadpessoas.model;

import java.util.Set;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Pessoa {

	private Long id;
	private String nome;
	private String cpf;
	private String email;
	private String telefone;

	private Set<Endereco> enderecos;
}

package br.com.cadpessoas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cadpessoas.model.Pessoa;
import br.com.cadpessoas.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;

	public Pessoa salvar(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

}

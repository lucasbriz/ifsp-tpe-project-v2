package com.ifsp.tpeproject.service;

import com.ifsp.tpeproject.entity.Pessoa;
import com.ifsp.tpeproject.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PessoaServiceImpl implements PessoaService{

  @Autowired
  PessoaRepository pessoaRepository;

  @Override
  public Pessoa createPessoa(Pessoa pessoa){
    return pessoaRepository.save(pessoa);
  }
}

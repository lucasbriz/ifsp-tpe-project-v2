package com.ifsp.tpeproject.controller;

import com.ifsp.tpeproject.entity.Pessoa;
import com.ifsp.tpeproject.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/pessoa")
public class PessoaController {

  @Autowired
  PessoaService pessoaService;

  @PostMapping
  public Pessoa createPessoa(@RequestBody Pessoa pessoa) {
    return pessoaService.createPessoa(pessoa);
  }
}

package com.ifsp.tpeproject.controller;

import com.ifsp.tpeproject.entity.Pessoa;
import com.ifsp.tpeproject.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/pessoa")
public class PessoaController {

  @Autowired
  private PessoaService pessoaService;

  @PostMapping
  public ResponseEntity<Pessoa> createPessoa(@RequestBody Pessoa pessoa) {
    return ResponseEntity.status(HttpStatus.CREATED).body(pessoaService.createPessoa(pessoa));
  }
}

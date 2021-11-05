package br.edu.usj.crud.crud_trabalho.database;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.usj.crud.crud_trabalho.entidade.Cadastro;

public interface RepositorioCadastro extends JpaRepository <Cadastro,Long> {
    
}
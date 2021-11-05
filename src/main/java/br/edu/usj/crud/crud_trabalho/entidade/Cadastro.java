package br.edu.usj.crud.crud_trabalho.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cadastro {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)  
private Long id;
@Column(nullable = false)
private String nome;
@Column(nullable = false)
private String raça;
@Column(nullable = false)
private String contato;
@Column(nullable = false)
private String proprietario;
public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getRaça() {
    return raça;
}
public void setRaça(String raça) {
    this.raça = raça;
}
public String getContato() {
    return contato;
}
public void setContato(String contato) {
    this.contato = contato;
}
public String getProprietario() {
    return proprietario;
}
public void setProprietario(String proprietario) {
    this.proprietario = proprietario;
}

}

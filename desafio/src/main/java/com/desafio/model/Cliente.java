package com.desafio.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Cliente {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String nome;
	
	private String cpf;
	
	private LocalDate dataNascimento;
	
	@OneToMany(targetEntity=Pedido.class, fetch=FetchType.EAGER)
    @JoinColumn(name="id")
	private List<Pedido> pedidos;
	
}

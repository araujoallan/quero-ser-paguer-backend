package com.desafio.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ItemPedido {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private Pedido pedido;
	
	private Produto produto;
	
	private BigDecimal quantidade;
	
	private BigDecimal preco;
	
}

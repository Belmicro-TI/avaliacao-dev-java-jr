package br.belmicro.api.teste.modelo;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Produto {

	private UUID id;
	private String nome;
	private float valor;

	
}

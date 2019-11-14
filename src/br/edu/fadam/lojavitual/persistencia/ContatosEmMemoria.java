package br.edu.fadam.lojavitual.persistencia;

import java.util.HashMap;
import java.util.Map;

import br.edu.fadam.lojavitual.modelo.Contato;

public class ContatosEmMemoria {

	public static Map<Long, Contato> contatos = new HashMap<Long, Contato>();
	
}

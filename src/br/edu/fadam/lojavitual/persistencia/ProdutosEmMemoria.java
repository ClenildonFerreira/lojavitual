package br.edu.fadam.lojavitual.persistencia;

import java.util.HashMap;
import java.util.Map;

import br.edu.fadam.lojavitual.modelo.Produto;

public class ProdutosEmMemoria {
	
	public static Map<Long, Produto> produtos = new HashMap<Long, Produto>();
	
}

package br.edu.fadam.lojavitual.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import br.edu.fadam.lojavitual.modelo.Contato;
import br.edu.fadam.lojavitual.persistencia.ContatosEmMemoria;

public class ContatoDao {
	
	public void inserir(Contato Contato) {
		System.out.println("Inserindo o Contato " + Contato.getNome());
		ContatosEmMemoria.contatos.put(Contato.getId(), Contato);
	}
	
	public void alterar(Contato Contato) {
		System.out.println("Alterando o Contato " + Contato.getNome());
		ContatosEmMemoria.contatos.remove(Contato.getId());
		ContatosEmMemoria.contatos.put(Contato.getId(), Contato);
	}
	
	public void deletar(Contato Contato) {
		ContatosEmMemoria.contatos.remove(Contato.getId());
		System.out.println("Inserindo o Contato " + Contato.getNome());
	}
	
	public List<Contato> listar() {
		List<Contato> contatos = new ArrayList<Contato>();
		System.out.println("Contatos:");
		for (Contato contato : ContatosEmMemoria.contatos.values()) {
			contatos.add(contato);
			System.out.println(contato.getNome());
		}
		return contatos;
	}
	
	public Contato buscarPorNome(String nome) {
		Collection<Contato> Contatos = ContatosEmMemoria.contatos.values();
		for (Contato Contato : Contatos) {
			if (nome.contentEquals(Contato.getNome())) {
				return Contato;
			}
		}
		return null;
	}

}

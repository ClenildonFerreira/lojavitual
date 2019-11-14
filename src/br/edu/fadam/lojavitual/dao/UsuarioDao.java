package br.edu.fadam.lojavitual.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

import br.edu.fadam.lojavitual.persistencia.UsuariosEmMemoria;
import br.edu.fadam.lojavitual.modelo.Usuario;

public class UsuarioDao {

	public void inserir(Usuario usuario) {
		System.out.println("Inserindo o usuário " + usuario.getNome());
		UsuariosEmMemoria.usuarios.put(usuario.getId(), usuario);
	}
	
	public void alterar(Usuario usuario) {
		System.out.println("Alterando o usuário " + usuario.getNome());
		UsuariosEmMemoria.usuarios.remove(usuario.getId());
		UsuariosEmMemoria.usuarios.put(usuario.getId(), usuario);
	}
	
	public void deletar(Usuario usuario) {
		UsuariosEmMemoria.usuarios.remove(usuario.getId());
		System.out.println("Inserindo o usuário " + usuario.getNome());
	}
	
	public List<Usuario> listar() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		System.out.println("Usuários:");
		for (Usuario usuario : UsuariosEmMemoria.usuarios.values()) {
			usuarios.add(usuario);
			System.out.println(usuario.getNome());
		}
		return usuarios;
	}
	
	public Usuario buscarPorNome(String nome) {
		Collection<Usuario> usuarios = UsuariosEmMemoria.usuarios.values();
		for (Usuario usuario : usuarios) {
			if (nome.contentEquals(usuario.getNome())) {
				return usuario;
			}
		}
		return null;
	}
	
}

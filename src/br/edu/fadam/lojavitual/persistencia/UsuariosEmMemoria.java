package br.edu.fadam.lojavitual.persistencia;

import java.util.HashMap;
import java.util.Map;

import br.edu.fadam.lojavitual.modelo.Usuario;


public class UsuariosEmMemoria {
	
	public static Map<Long, Usuario> usuarios = new HashMap<Long, Usuario>();

}

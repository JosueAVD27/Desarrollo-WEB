package com.espe.dao;

import java.util.List;

import com.espe.model.Usuario;


public interface UsuarioDao {

	// Guardar usuario
	public void guardarUsuario(Usuario usuario);

	// Editar usuario
	public void editarUsuario(Usuario usuario);

	// Buscar usuario
	public Usuario buscarUsuario(int id);

	// Obtener todos los usuarios
	public List<Usuario> obtenerUsuario();

	// Eliminar usuario
	public void eliminarUsuario(int id);
}

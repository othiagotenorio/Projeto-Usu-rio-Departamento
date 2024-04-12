package com.othiagotenorio.usuariodepartamento.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.othiagotenorio.usuariodepartamento.entidades.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

}

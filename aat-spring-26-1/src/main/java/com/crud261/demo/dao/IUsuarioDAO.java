package com.crud261.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud261.demo.dto.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

	Usuario findByUsername(String username);
}
package com.crud261.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud261.demo.dto.Pieza;



public interface IPiezaDAO extends JpaRepository<Pieza,Integer> {



	
}

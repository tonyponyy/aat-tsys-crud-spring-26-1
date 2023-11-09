package com.crud261.demo.service;
import java.util.List;

import com.crud261.demo.dto.Pieza;




public interface IPiezaService {
	
	//Listar todos
	public List<Pieza> listarPiezas();
	
	//Listar por id
	public Pieza piezaXID(Integer id); 
	
	//Guardar
	public Pieza guardarPieza(Pieza Fabricante);
	
	//Actualizar
	public Pieza actualizarPieza(Pieza Fabricante);
	
	//Eliminar
	public void eliminarPieza(Integer id);

	
}
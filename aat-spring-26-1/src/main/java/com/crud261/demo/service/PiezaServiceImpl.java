package com.crud261.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crud261.demo.dao.IPiezaDAO;
import com.crud261.demo.dto.Pieza;

@Service
public class PiezaServiceImpl implements IPiezaService {
	
	@Autowired
	IPiezaDAO ipiezaDAO;

	//Listar todos
		public List<Pieza> listarPiezas(){
			return ipiezaDAO.findAll();
		};
		
		
		//Listar por id
		public Pieza piezaXID(Integer id) {
			return ipiezaDAO.findById(id).get();
		}; 
		
		//Guardar
		public Pieza guardarPieza(Pieza pieza) {
			return ipiezaDAO.save(pieza);
		};
		
		//Actualizar
		public Pieza actualizarPieza(Pieza pieza) {
			return ipiezaDAO.save(pieza);
		};
		
		//Eliminar
		public void eliminarPieza(Integer id) {
			ipiezaDAO.deleteById(id);
		}


}
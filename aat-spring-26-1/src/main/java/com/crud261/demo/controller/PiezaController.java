package com.crud261.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud261.demo.dto.Pieza;
import com.crud261.demo.service.PiezaServiceImpl;


@RestController
@RequestMapping("/piezas")
public class PiezaController {
	@Autowired
	private PiezaServiceImpl piezaServiceImpl;

	@GetMapping("/all")
	public List<Pieza> listarPiezas(){
		return piezaServiceImpl.listarPiezas();
	}
	@PostMapping("/add")
	public Pieza salvarpieza(@RequestBody Pieza pieza) {
		return piezaServiceImpl.guardarPieza(pieza);
	}
	@GetMapping("/{id}")
	public Pieza piezaXID(@PathVariable(name="id") Integer id) {
		Pieza pieza_xid= new Pieza();	
		pieza_xid=piezaServiceImpl.piezaXID(id);
		return pieza_xid;
	}
	
	@PutMapping("/{id}")
	public Pieza actualizarpieza(@PathVariable(name="id")Integer id,@RequestBody Pieza pieza) {
		
		Pieza pieza_seleccionado= new Pieza();
		Pieza pieza_actualizado= new Pieza();
		
		pieza_seleccionado= piezaServiceImpl.piezaXID(id);
		pieza_seleccionado.setNombre(pieza.getNombre());
		pieza_actualizado = piezaServiceImpl.actualizarPieza(pieza_seleccionado);
		System.out.println("El pieza actualizado es: "+ pieza_actualizado);
		return pieza_actualizado;
	}
	
	@DeleteMapping("/{id}")
	public void eliminarpieza(@PathVariable(name="id")Integer id) {
		piezaServiceImpl.eliminarPieza(id);
		System.out.println("pieza eliminado");
	}
	


}

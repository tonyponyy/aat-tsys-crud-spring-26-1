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

import com.crud261.demo.dto.Suministra;
import com.crud261.demo.service.SuministraServiceImpl;


@RestController
@RequestMapping("/suministra")
public class SuministraController {
	@Autowired
	private SuministraServiceImpl suministraServiceImpl;

	@GetMapping("/all")
	public List<Suministra> listarSuministras(){
		return suministraServiceImpl.listarSuministros();
	}
	@PostMapping("/add")
	public Suministra salvarsuministra(@RequestBody Suministra suministra) {
		return suministraServiceImpl.guardarSuministra(suministra);
	}
	@GetMapping("/{id}")
	public Suministra suministraXID(@PathVariable(name="id") Integer id) {
		Suministra suministra_xid= new Suministra();	
		suministra_xid=suministraServiceImpl.suministraXID(id);
		return suministra_xid;
	}
	
	@PutMapping("/{id}")
	public Suministra actualizarsuministra(@PathVariable(name="id")Integer id,@RequestBody Suministra suministra) {
		
		Suministra suministra_seleccionado= new Suministra();
		Suministra suministra_actualizado= new Suministra();
		
		suministra_seleccionado= suministraServiceImpl.suministraXID(id);
		suministra_seleccionado.setPrecio(suministra.getPrecio());
		suministra_seleccionado.setProveedor(suministra.getProveedor());
		suministra_seleccionado.setPieza(suministra.getPieza());
		suministra_actualizado = suministraServiceImpl.actualizarSuministra(suministra_seleccionado);
		System.out.println("El suministra actualizado es: "+ suministra_actualizado);
		return suministra_actualizado;
	}
	
	@DeleteMapping("/{id}")
	public void eliminarsuministra(@PathVariable(name="id")Integer id) {
		suministraServiceImpl.eliminarSuministra(id);
		System.out.println("suministra eliminado");
	}
	


}

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

import com.crud261.demo.dto.Proveedor;
import com.crud261.demo.service.ProveedorServiceImpl;


@RestController
@RequestMapping("/proveedores")
public class ProveedorController {
	@Autowired
	private ProveedorServiceImpl proveedorServiceImpl;

	@GetMapping("/all")
	public List<Proveedor> listarProveedors(){
		return proveedorServiceImpl.listarProveedores();
	}
	@PostMapping("/add")
	public Proveedor salvarproveedor(@RequestBody Proveedor proveedor) {
		return proveedorServiceImpl.guardarProveedor(proveedor);
	}
	@GetMapping("/{id}")
	public Proveedor proveedorXID(@PathVariable(name="id") Integer id) {
		Proveedor proveedor_xid= new Proveedor();	
		proveedor_xid=proveedorServiceImpl.proveedorXID(id);
		return proveedor_xid;
	}
	
	@PutMapping("/{id}")
	public Proveedor actualizarproveedor(@PathVariable(name="id")Integer id,@RequestBody Proveedor proveedor) {
		
		Proveedor proveedor_seleccionado= new Proveedor();
		Proveedor proveedor_actualizado= new Proveedor();
		
		proveedor_seleccionado= proveedorServiceImpl.proveedorXID(id);
		proveedor_seleccionado.setNombre(proveedor.getNombre());
		proveedor_actualizado = proveedorServiceImpl.actualizarProveedor(proveedor_seleccionado);
		System.out.println("El proveedor actualizado es: "+ proveedor_actualizado);
		return proveedor_actualizado;
	}
	
	@DeleteMapping("/{id}")
	public void eliminarproveedor(@PathVariable(name="id")Integer id) {
		proveedorServiceImpl.eliminarProveedor(id);
		System.out.println("proveedor eliminado");
	}
	


}

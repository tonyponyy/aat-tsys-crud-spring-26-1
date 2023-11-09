package com.crud261.demo.service;
import java.util.List;

import com.crud261.demo.dto.Proveedor;



public interface IProveedorService {
	
	//Listar todos
	public List<Proveedor> listarProveedores();
	
	//Listar por id
	public Proveedor proveedorXID(Integer id); 
	
	//Guardar
	public Proveedor guardarProveedor(Proveedor Fabricante);
	
	//Actualizar
	public Proveedor actualizarProveedor(Proveedor Fabricante);
	
	//Eliminar
	public void eliminarProveedor(Integer id);

	
}
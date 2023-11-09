package com.crud261.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud261.demo.dao.IProveedorDAO;
import com.crud261.demo.dto.Proveedor;



@Service
public class ProveedorServiceImpl implements IProveedorService {
	
	@Autowired
	IProveedorDAO iproveedorDAO;

	//Listar todos
		public List<Proveedor> listarProveedores(){
			return iproveedorDAO.findAll();
		};
		
		
		//Listar por id
		public Proveedor proveedorXID(Integer id) {
			return iproveedorDAO.findById(id).get();
		}; 
		
		//Guardar
		public Proveedor guardarProveedor(Proveedor proveedor) {
			return iproveedorDAO.save(proveedor);
		};
		
		//Actualizar
		public Proveedor actualizarProveedor(Proveedor proveedor) {
			return iproveedorDAO.save(proveedor);
		};
		
		//Eliminar
		public void eliminarProveedor(Integer id) {
			iproveedorDAO.deleteById(id);
		}


}
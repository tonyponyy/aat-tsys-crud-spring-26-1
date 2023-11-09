package com.crud261.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud261.demo.dao.ISuministraDAO;
import com.crud261.demo.dto.Suministra;

@Service
public class SuministraServiceImpl implements ISuministraService {
    
    @Autowired
    ISuministraDAO isuministraDAO;

    // Listar todos los suministros
    public List<Suministra> listarSuministros(){
        return isuministraDAO.findAll();
    }
    
    // Obtener un suministro por su ID
    public Suministra suministraXID(Integer id) {
        return isuministraDAO.findById(id).get();
    }
    
    // Guardar un suministro
    public Suministra guardarSuministra(Suministra suministra) {
        return isuministraDAO.save(suministra);
    }
    
    // Actualizar un suministro
    public Suministra actualizarSuministra(Suministra suministra) {
        return isuministraDAO.save(suministra);
    }
    
    // Eliminar un suministro por su ID
    public void eliminarSuministra(Integer id) {
        isuministraDAO.deleteById(id);
    }
}
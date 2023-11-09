package com.crud261.demo.service;

import java.util.List;
import com.crud261.demo.dto.Suministra;

public interface ISuministraService {
    
    // Listar todos los suministros
    public List<Suministra> listarSuministros();
    
    // Obtener un suministro por su ID
    public Suministra suministraXID(Integer id);
    
    // Guardar un suministro
    public Suministra guardarSuministra(Suministra suministra);
    
    // Actualizar un suministro
    public Suministra actualizarSuministra(Suministra suministra);
    
    // Eliminar un suministro por su ID
    public void eliminarSuministra(Integer id);
}
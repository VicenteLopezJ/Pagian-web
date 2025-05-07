package pe.edu.vallegrande.proyect.service;

import pe.edu.vallegrande.proyect.model.Proveedor;
import java.util.List;
import java.util.Optional;

public interface ProveedorService {

    List<Proveedor> findAll();

    Optional<Proveedor> findById(Long id);

    Proveedor save(Proveedor proveedor);

    Proveedor update(Proveedor proveedor);

    void delete(Long id);
    
}
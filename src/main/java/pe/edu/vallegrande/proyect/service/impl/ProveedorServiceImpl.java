package pe.edu.vallegrande.proyect.service.impl;

import pe.edu.vallegrande.proyect.model.Proveedor;
import pe.edu.vallegrande.proyect.repository.ProveedorRepository;
import pe.edu.vallegrande.proyect.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ProveedorServiceImpl implements ProveedorService {

    private final ProveedorRepository proveedorRepository;

    @Autowired
    public ProveedorServiceImpl(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    @Override
    public List<Proveedor> findAll() {
        log.info("Listando Datos: ");
        return proveedorRepository.findAll();
    }

    @Override
    public Optional<Proveedor> findById(Long id) {
        log.info("Listando Datos por ID: ");
        return proveedorRepository.findById(id);
    }

    @Override
    public Proveedor save(Proveedor proveedor) {
        log.info("Registrando Datos: " + proveedor.toString());
        proveedor.setState("A");
        return proveedorRepository.save(proveedor);
    }

    @Override
    public Proveedor update(Proveedor proveedor) {
        log.info("Editando Datos: " + proveedor.toString());
        proveedor.setState("A");
        return proveedorRepository.save(proveedor);
    }

    @Override
    public void delete(Long id) {
        log.info("Eliminando proveedor con ID: {}", id);
        proveedorRepository.deleteById(id);  // Eliminar el proveedor físicamente de la base de datos
        log.info("proveedor eliminado con ID: {}", id);
    }
}

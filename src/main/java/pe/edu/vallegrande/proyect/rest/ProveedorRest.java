package pe.edu.vallegrande.proyect.rest;

import pe.edu.vallegrande.proyect.model.Proveedor;
import pe.edu.vallegrande.proyect.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/api/proveedor")
public class ProveedorRest {

    private final ProveedorService proveedorService;

    @Autowired
    public ProveedorRest(ProveedorService proveedorService) {
        this.proveedorService = proveedorService;
    }
    
    @GetMapping
    public List<Proveedor> findAll() {
        return proveedorService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Proveedor> findById(@PathVariable Long id) {
        return proveedorService.findById(id);
    }

    @PostMapping("/save")
    public Proveedor save(@RequestBody Proveedor proveedor) {
        return proveedorService.save(proveedor);
    }

    @PutMapping("/update")
    public Proveedor update(@RequestBody Proveedor proveedor) {
        return proveedorService.update(proveedor);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        proveedorService.delete(id);  // Llamar al servicio para eliminar físicamente el cliente
        return "proveedor eliminado con ID: " + id;
    }
}

package pe.edu.vallegrande.proyect.rest;

import pe.edu.vallegrande.proyect.model.Cliente;
import pe.edu.vallegrande.proyect.service.ClienteService;

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
@RequestMapping("/v1/api/clientes")
public class ClienteRest {

    private final ClienteService clienteService;

    @Autowired
    public ClienteRest(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
    
    @GetMapping
    public List<Cliente> findAll() {
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> findById(@PathVariable Long id) {
        return clienteService.findById(id);
    }

    @PostMapping("/save")
    public Cliente save(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @PutMapping("/update")
    public Cliente update(@RequestBody Cliente cliente) {
        return clienteService.update(cliente);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        clienteService.delete(id); 
        return "Cliente eliminado con ID: " + id;
    }

    @GetMapping("/estado/{estado}")
    public List<Cliente> findByEstado(@PathVariable String estado) {
        return clienteService.findByEstado(estado);
    }
    

    @PutMapping("/restore/{id}")
    public String restore(@PathVariable Long id) {
        clienteService.restore(id);
        return "Cliente restaurado con ID: " + id;
    }
    

}

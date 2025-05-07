package pe.edu.vallegrande.proyect.service.impl;

import pe.edu.vallegrande.proyect.model.Cliente;
import pe.edu.vallegrande.proyect.repository.ClienteRepository;
import pe.edu.vallegrande.proyect.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public List<Cliente> findAll() {
        log.info("Listando Datos: ");
        return clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> findById(Long id) {
        log.info("Listando Datos por ID: ");
        return clienteRepository.findById(id);
    }

    @Override
    public Cliente save(Cliente cliente) {
        log.info("Registrando Datos: " + cliente.toString());
        cliente.setCustomerType("A");
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente update(Cliente cliente) {
        log.info("Editando Datos: " + cliente.toString());
        cliente.setCustomerType("A");
        return clienteRepository.save(cliente);
    }

    @Override
    public void delete(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        cliente.ifPresent(c -> {
            c.setEstado(Cliente.ESTADO_INACTIVO); // "0"
            clienteRepository.save(c);
        });
    }

    @Override
    public void restore(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        cliente.ifPresent(c -> {
            c.setEstado(Cliente.ESTADO_ACTIVO);
            clienteRepository.save(c);
        });
    }

    @Override
    public List<Cliente> findByEstado(String estado) {
        return clienteRepository.findByEstado(estado);
    }

}

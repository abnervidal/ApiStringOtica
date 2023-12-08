package com.example.apispringotica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apispringotica.entities.Cliente;
import com.example.apispringotica.repositories.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> create(Cliente cliente) {
        clienteRepository.save(cliente);
        return list();
    }

    public List<Cliente> list() {
        return clienteRepository.findAll();
    }
    public List<Cliente> update(Cliente cliente) {
        clienteRepository.save(cliente);
        return list();
    }
    public List<Cliente> delete(Integer idCliente) {
        clienteRepository.deleteById(idCliente);
        return list();
    }
}

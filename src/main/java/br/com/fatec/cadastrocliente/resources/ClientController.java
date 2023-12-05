package br.com.fatec.cadastrocliente.resources;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.fatec.cadastrocliente.entities.Client;
import br.com.fatec.cadastrocliente.repositories.ClientRepository;

@RestController
public class ClientController {
    
  
    @Autowired
    private ClientRepository repository;


    @GetMapping("clients")
    public java.util.List<Client> getClients(){
          return repository.findAll();
    }

     @GetMapping("clients/{id}")
    public Client getClientById(@PathVariable int id){
          return repository.findById(id).get();
    }
}

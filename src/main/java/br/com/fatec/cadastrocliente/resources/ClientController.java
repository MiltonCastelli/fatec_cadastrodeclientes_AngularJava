package br.com.fatec.cadastrocliente.resources;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fatec.cadastrocliente.entities.Client;

@RestController
public class ClientController {
    
    @GetMapping("client")
    public Client getClient(){
        Client c = new Client();
        c.setId(0);
        c.setNome("Milton");
        c.setEmail("castellimus@gmail.com");
        c.setTelefone("11983553097");
        c.setEndereço("Rua Pitassilgo");
        c.setCep("13300-000");  
        c.setCidade("Itu");
        c.setEstado("São Paulo");
        return c;
    }

     @GetMapping("clients")
    public java.util.List<Client> getClients(){
        ArrayList<Client> clients = new ArrayList<Client>();

        Client c1 = new Client();
        c1.setId(11);
        c1.setNome("Milton");
        c1.setEmail("castellimus@gmail.com");
        c1.setTelefone("11983553097");
        c1.setEndereço("Rua Pitassilgo");
        c1.setCep("13300-000");  
        c1.setCidade("Itu");
        c1.setEstado("São Paulo");

        Client c2 = new Client();
        c2.setId(12);
        c2.setNome("Laura");
        c2.setEmail("xxxxxxxxxx");
        c2.setTelefone("11xxxxxxxx");
        c2.setEndereço("Rua plutassilgo");
        c2.setCep("14500-000");  
        c2.setCidade("Itupeva");
        c2.setEstado("São Paulo");
       

        clients.add(c1);
        clients.add(c2);

        return clients;
    }

    
}

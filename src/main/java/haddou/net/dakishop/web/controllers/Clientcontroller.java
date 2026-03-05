package haddou.net.dakishop.web.controllers;

import haddou.net.dakishop.dao.entities.Client;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
@ComponentScan(basePackages = "haddou.net.dakishop")
public class Clientcontroller {


    List<Client> clients;

    @GetMapping("/test")
    public String testwork(){
        return "hello world ana ";
    }

    @GetMapping ("/ajouter/{id}/{nom}/{email}")
    public String ajouter(@PathVariable Long id,
                          @PathVariable String nom,
                          @PathVariable String email){
        Client client=new Client(id,nom,email);
        clients.add(client);
        return "ajouter avec succ";

    }

    @GetMapping("/testapi")
    public List<Client> getAllClients(){
        return clients;

    }
}

package com.example.SpringBootMVC.SpringBootMVCPostgreSQL;

//import SB.*;
import com.example.SpringBootMVC.model.Client1;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ClientController {

    @Autowired
    private ClientRepository aClientRepository;
    
    @Autowired
    private ClientServiceImpl aClientServiceImpl;
    
//    @GetMapping("/clients")
//    public String clients(
//        @RequestParam(name = "name", required = false, defaultValue = "world") String name,
//        @RequestParam(name = "email", required = false, defaultValue = "world") String email,
//        @RequestParam(name = "phone", required = false, defaultValue = "world") String phone,
//        @RequestParam(name = "todo", required = false, defaultValue = "world") String todo,
//        Map<String, Object> model
//    ) {
//        model.put(todo, name);
//        return "clients";
//    }
//    
//    @GetMapping
//    public String result(Map<String, Object> model) {
//        Iterable<Client> clients = aClientRepository.findAll();
//        model.put("clients", clients);
//        return "clientsResult";
//    }
    
    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        Iterable<Client> clients = aClientRepository.findAll();
        model.addAttribute("clients", clients);
        return "clientsResult";
    }

    @PostMapping("/clients")
    public String greetingSubmit(/*@ModelAttribute Client client, */Model model,
            @RequestParam(name = "id", required = false, defaultValue = "world") Integer id,
            @RequestParam(name = "name", required = false, defaultValue = "world") String name,
            @RequestParam(name = "email", required = false, defaultValue = "world") String email,
            @RequestParam(name = "phone", required = false, defaultValue = "world") String phone,
            @RequestParam(name = "todo", required = false, defaultValue = "world") String todo
            ) {
        //model.addAttribute("clients", client);
        Client client = new Client(id, name, email, phone, todo);
        /*
        aClientRepository.save(client);
        Iterable<Client> clients = aClientRepository.findAll();
        model.addAttribute("clients", clients);
        */
        aClientServiceImpl.create(client);
        Iterable<Client> clients = aClientServiceImpl.readAll();
        model.addAttribute("clients", clients);
        
        System.out.println("we are in result");
        return "clientsResult";
    }
    
    @GetMapping("/clients")
    public String greetingSubmit2(@ModelAttribute Client client, Model model) {
        model.addAttribute("clients", client);
        //System.out.println("we are in result");
        return "clients";
    }
    
}

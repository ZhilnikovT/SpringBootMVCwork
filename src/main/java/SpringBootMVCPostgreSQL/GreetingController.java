package SpringBootMVCPostgreSQL;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {
    
    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Client());
        System.out.println("we are in greeting");
    return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Client client, Model model) {
        model.addAttribute("greeting", client);
        System.out.println("we are in result");
    return "result";
    }
}

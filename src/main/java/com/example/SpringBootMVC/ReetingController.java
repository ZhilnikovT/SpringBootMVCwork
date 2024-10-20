package com.example.SpringBootMVC;

import com.example.SpringBootMVC.model.Client1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReetingController {
    
    @GetMapping("/reeting")
    public String reetingForm(Model model) {
        model.addAttribute("greeting", new Client1());
        System.out.println("we are in meeting");
    return "reeting";
    }

    @PostMapping("/reeting")
    public String reetingSubmit(@ModelAttribute Client1 client, Model model) {
        model.addAttribute("greeting", client);
        System.out.println("we are in meetingResult");
    return "result";
    }
}

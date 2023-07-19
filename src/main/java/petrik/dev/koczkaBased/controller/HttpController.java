package petrik.dev.koczkaBased.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HttpController {

    @GetMapping("/")
    public String helloWorld(@RequestParam(required = false, defaultValue = "index") String param, Model model) {
        model.addAttribute("message", param);
        return "index";
    }
}

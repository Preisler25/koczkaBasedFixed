package petrik.dev.koczkaBased.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuotController {

    @GetMapping("/quotation")
    public String helloWorld(@RequestParam(required = false, defaultValue = "index") String param, Model model) {
        model.addAttribute("message", param);
        return "index";
    }
}

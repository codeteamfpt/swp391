package fpt.codeteam.src.controller;

import fpt.codeteam.src.service.iclass.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("demo")
public class ControllerTest {
    @Autowired
    private TestService testService;

    @RequestMapping("/home")
    public String homeAdmin(Model model) {
        model.addAttribute("message", testService.test());
        return "index";
    }
}

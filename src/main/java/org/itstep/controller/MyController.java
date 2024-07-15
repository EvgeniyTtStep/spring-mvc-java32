package org.itstep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {



//    @GetMapping("/hello")
//    public String hello() {
//       return "Hello from controller";
//    }


    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/model")
    public String modelEx(Model model) {
        model.addAttribute("my_msg", "Hello from controller");
        return "home";
    }

    @GetMapping("/path/{name}")
    public String paramEx(@PathVariable String name, Model model) {
        model.addAttribute("myName", name);
        return "home";
    }



}

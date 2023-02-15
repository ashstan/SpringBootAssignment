package com.example.springbootassignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String showHomePage() { return "index"; }

    @RequestMapping("/step1")
    public String showStep1() {return "pages/step1"; }

    @RequestMapping("/step2")
    public String showStep2() {return "pages/step2"; }

    @RequestMapping("/step3")
    public String showStep3() {return "pages/step3"; }
}

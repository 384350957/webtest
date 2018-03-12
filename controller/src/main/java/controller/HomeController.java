package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import service.SignInService;

public class HomeController {
    @Autowired
    private SignInService signInService;

    @RequestMapping("/")
    public String home(){

        return "";
    }
}

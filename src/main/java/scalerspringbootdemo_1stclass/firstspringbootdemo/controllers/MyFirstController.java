package scalerspringbootdemo_1stclass.firstspringbootdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import scalerspringbootdemo_1stclass.firstspringbootdemo.services.MyFirstServices;

@RestController
public class MyFirstController {
    private MyFirstServices myFirstServices;
    public MyFirstController(MyFirstServices myFirstServices){
        this.myFirstServices=myFirstServices;
    }
    @GetMapping("/")
    public String SayHi(){
        return "Hello World!";
    }
}

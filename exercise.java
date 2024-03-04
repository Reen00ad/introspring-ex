package com.example.introductionex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class exercise {


  @GetMapping(path = "/name")
    public String name(){
        return "My name is Reenad";
    }
    @GetMapping(path = "/age")
    public String age(){
      return "My age is 23";
    }
    @GetMapping(path = "/check/status")
    public String check(){
      return "Everything ok";
    }
    @GetMapping(path = "/health")
    public String health(){
      return "Server health is up and running";
    }
    @GetMapping(path = "/names")
    public String[] names(){
      String [] names={"nouf","fahad","lana"};
      return names;
    }

}

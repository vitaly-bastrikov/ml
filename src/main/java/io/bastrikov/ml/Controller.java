package io.bastrikov.ml;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String hello(){
        String hello =  "hello from feature2";
        return hello;


    }
}

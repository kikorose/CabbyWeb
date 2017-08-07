package me.kikorose.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {

    @GetMapping("/crab")
        public String Crab(){
        return"crab";

        }

    }


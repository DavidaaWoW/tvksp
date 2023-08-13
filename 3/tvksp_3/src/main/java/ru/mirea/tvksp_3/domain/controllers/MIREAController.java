package ru.mirea.tvksp_3.domain.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MIREAController {
    @GetMapping("/gerb")
    public String getImage(){
        return "<img src=\"/gerb.png\"></img>";
    }
}

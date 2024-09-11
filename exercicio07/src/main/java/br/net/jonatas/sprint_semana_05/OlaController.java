package br.net.jonatas.sprint_semana_05;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {
    @GetMapping("/ola")
    public String olaMund(){
        return "Ola Mundo!";
    }
}

package jonatas.example.demo.controllers;

import jonatas.example.demo.models.SteamApp;
import jonatas.example.demo.services.Steam_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/steam")
public class Steam_controller {

    @Autowired
    private Steam_service steamService;

    @GetMapping("/game/{name}")
    public ResponseEntity<?> getGame(@PathVariable String name) {
        System.out.println("#log# Jogo: " + name);
        String gameDetails = steamService.getGameDetails(name);
        if (gameDetails != null) {
            return ResponseEntity.ok(gameDetails);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Jogo não encontrado");
        }
    }

    @GetMapping("/sobre")
    public HashMap<String, String> sobre(){
        HashMap<String, String> sobre = new HashMap<>();
        sobre.put("nome", "Jonatas Fernandes Grassi");
        sobre.put("projeto", "Buscador de informações de jogos na Steam");
        return sobre;
    }
}

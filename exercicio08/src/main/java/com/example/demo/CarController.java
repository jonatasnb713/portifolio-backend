package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/carros")
public class CarController {

    @PostMapping("/fipe")
    public ResponseEntity<CarResponse> getCarFipeValue(@RequestBody CarRequest carRequest) {
        // URL da API da Tabela FIPE (ajuste conforme necessário)
        String fipeApiUrl = "https://api.fipe.org.br/{marca}/{modelo}/{ano}";

        // Substituindo os parâmetros da URL
        String url = fipeApiUrl
                .replace("{marca}", carRequest.getMarca())
                .replace("{modelo}", carRequest.getModelo())
                .replace("{ano}", String.valueOf(carRequest.getAno()));

        // Consumindo a API com RestTemplate
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<FipeResponse> response = restTemplate.getForEntity(url, FipeResponse.class);

        // Retornando a resposta formatada
        CarResponse carResponse = new CarResponse(response.getBody().getValor(), "Setembro de 2024");
        return ResponseEntity.ok(carResponse);
    }
}
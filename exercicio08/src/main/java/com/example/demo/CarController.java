package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/carros")
public class CarController {

    @PostMapping("/fipe")
    public ResponseEntity<CarResponse> getCarFipeValue(@RequestBody CarRequest carRequest) {
        String fipeApiUrl = "https://api.fipe.org.br/{marca}/{modelo}/{ano}";

        String url = fipeApiUrl
                .replace("{marca}", carRequest.getMarca())
                .replace("{modelo}", carRequest.getModelo())
                .replace("{ano}", String.valueOf(carRequest.getAno()));

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<FipeResponse> response = restTemplate.getForEntity(url, FipeResponse.class);

        CarResponse carResponse = new CarResponse(response.getBody().getValor(), "Setembro de 2024");
        return ResponseEntity.ok(carResponse);
    }
}
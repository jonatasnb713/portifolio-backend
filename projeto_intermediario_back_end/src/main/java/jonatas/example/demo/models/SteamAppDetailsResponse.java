package jonatas.example.demo.models;

import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class SteamAppDetailsResponse {
    public String getJsonFromUrl(String url) {
        RestTemplate restTemplate = new RestTemplate();

        // Faz a requisição GET e recebe a resposta como String
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        // Retorna o corpo da resposta que contém o JSON
        return response.getBody();
    }
}
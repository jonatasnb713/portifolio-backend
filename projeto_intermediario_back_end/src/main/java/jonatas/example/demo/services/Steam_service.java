package jonatas.example.demo.services;

import jonatas.example.demo.models.SteamApp;
import jonatas.example.demo.models.SteamAppDetailsResponse;
import jonatas.example.demo.models.SteamAppListResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Steam_service {

    private static final String STEAM_API_URL = "https://api.steampowered.com/ISteamApps/GetAppList/v2/";
    private static final String STEAM_APP_DETAILS_URL = "https://store.steampowered.com/api/appdetails?appids=";

    public String getGameDetails(String gameName) {
        RestTemplate restTemplate = new RestTemplate();

        SteamAppListResponse appListResponse = restTemplate.getForObject(STEAM_API_URL, SteamAppListResponse.class);

        if (appListResponse != null && appListResponse.getApplist() != null) {
            for (SteamApp app : appListResponse.getApplist().getApps()) {
                if (app.getName().equalsIgnoreCase(gameName)) {
                    String appDetailsUrl = STEAM_APP_DETAILS_URL + app.getAppid();


                    SteamAppDetailsResponse service = new SteamAppDetailsResponse();
                    String jsonResponse = service.getJsonFromUrl(appDetailsUrl);

                    return jsonResponse;
                    }
                }
            }
        return null;
    }
}
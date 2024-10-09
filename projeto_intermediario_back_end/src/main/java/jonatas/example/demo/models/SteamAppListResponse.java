package jonatas.example.demo.models;

import java.util.List;

public class SteamAppListResponse {
    private Applist applist;

    // Getters e Setters
    public Applist getApplist() {
        return applist;
    }

    public void setApplist(Applist applist) {
        this.applist = applist;
    }

    public static class Applist {
        private List<SteamApp> apps;

        // Getters e Setters
        public List<SteamApp> getApps() {
            return apps;
        }

        public void setApps(List<SteamApp> apps) {
            this.apps = apps;
        }
    }
}


package jonatas.example.demo.models;

public class SteamAppDetails {
    private boolean success;
    private SteamApp data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public SteamApp getData() {
        return data;
    }

    public void setData(SteamApp data) {
        this.data = data;
    }
}
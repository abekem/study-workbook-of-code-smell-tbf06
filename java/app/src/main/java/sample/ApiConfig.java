package sample;

import java.util.Map;

import sample.utils.File;
import sample.utils.JSON;

public class ApiConfig {
    private static final String CONFIG_PATH = "/api_config.json";

    private Map<String, String> conf;

    public ApiConfig() {
        File file = new File(CONFIG_PATH);
        String json = file.read();
        this.conf = JSON.parse(json);
    }

    public String getId() {
        return conf.get("id");
    }

    public String getPassword() {
        return conf.get("password");
    }
}

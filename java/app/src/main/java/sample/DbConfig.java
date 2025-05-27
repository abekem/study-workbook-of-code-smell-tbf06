package sample;

import java.util.Map;

import sample.utils.File;
import sample.utils.JSON;

public class DbConfig implements ConfigInterface {
    private static final String CONFIG_PATH = "/db_config.json";

    private Map<String, String> conf;

    public DbConfig() {
        File file = new File(CONFIG_PATH);
        String json = file.read();
        this.conf = JSON.parse(json);
    }

    public String getId() {
        return null;
    }

    public String getUser() {
        return this.conf.get("user");
    }

    public String getPassword() {
        return this.conf.get("password");
    }
}
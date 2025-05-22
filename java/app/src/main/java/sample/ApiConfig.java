package sample;

import java.util.Map;

import sample.utils.File;
import sample.utils.JSON;

public class ApiConfig {
    private static final String CONF_PATH = "/api_config.json";

    private Map<String, String> conf;

    public ApiConfig() {
        // JSONファイルを読み込む
        File file = new File(CONF_PATH);
        String json = file.read();

        // JSON文字列をMapに変換
        this.conf = JSON.parse(json);
    }

    public String getId() {
        return conf.get("id");
    }

    public String getPassword() {
        return conf.get("password");
    }
}

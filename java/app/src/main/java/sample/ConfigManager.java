package sample;

import java.util.Map;

import sample.utils.File;
import sample.utils.JSON;

public class ConfigManager {
    private static final String API_CONFIG_PATH = "/api_config.json";
    private static final String DB_CONFIG_PATH = "/db_config.json";

    private Map<String, String> conf;

    public ConfigManager(String type) {
        switch (type) {
            case "api": {
                // JSONファイルを読み込む
                File file = new File(API_CONFIG_PATH);
                String json = file.read();

                // JSON文字列をMapに変換
                this.conf = JSON.parse(json);
                break;
            }
            case "db": {
                // JSONファイルを読み込む
                File file = new File(DB_CONFIG_PATH);
                String json = file.read();

                // JSON文字列をMapに変換
                this.conf = JSON.parse(json);
                break;
            }
            default:
                throw new IllegalArgumentException("Configのタイプは 'api' か 'db' を指定してください。");
        }
    }

    public String getId() {
        return conf.get("id");
    }

    public String getPassword() {
        return conf.get("password");
    }
}

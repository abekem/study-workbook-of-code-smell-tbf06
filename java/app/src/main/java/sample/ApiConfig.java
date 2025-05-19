package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ApiConfig {
    private static final String CONF_PATH = "/api_config.json";

    private Map<String, String> conf;

    public ApiConfig() {
        ObjectMapper mapper = new ObjectMapper();
        try (InputStream is = getClass().getResourceAsStream(CONF_PATH);
                BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            // JSONファイルを読み込む
            String json = br.lines().reduce("", (acc, line) -> acc + line);

            // JSON文字列をMapに変換
            TypeReference<HashMap<String, String>> reference = new TypeReference<HashMap<String, String>>() { };
            this.conf = mapper.readValue(json, reference);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getId() {
        return conf.get("id");
    }

    public String getPassword() {
        return conf.get("password");
    }
}

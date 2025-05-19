package java;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

import netscape.javascript.JSObject;

public class ApiConfig {
    private static final String CONF_PATH = "/api_config.json";

    private Map<String, String> conf;

    public ApiConfig() {
        try (InputStream is = getClass().getResourceAsStream(CONF_PATH);
                BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            System.out.println(br.readLine());
            // String json = File.readAllText(CONF_PATH);
            String json = br.lines().collect();
            
            // JSONをパースしてMapに変換
            ObjectMapper objectMapper = new ObjectMapper();
            // JSON文字列をMapに変換
            this.conf = mapper.readValue(json, Map.class);
            this.conf = JSObject.parse(json);

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

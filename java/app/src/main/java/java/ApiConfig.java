package main.java.java;

import java.io.BufferedReader;
import java.io.File;

import netscape.javascript.JSObject;

public class ApiConfig {
    private static final String CONF_PATH = "/api_config.json";

    private String conf;

    public ApiConfig() {
        try (InputStream is = getClass().getResourceAsStream(CONF_PATH);
                BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            System.out.println(br.readLine());
            // String json = File.readAllText(CONF_PATH);
            String json = br.lines().collect();
            this.conf = JSObject.parse(json);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

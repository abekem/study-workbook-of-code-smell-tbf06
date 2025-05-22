package sample.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class File {
    String path;

    public File(String path) {
        this.path = path;
    }

    public String read() {
        String result = "";
        try (InputStream is = getClass().getResourceAsStream(path);
                BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            result = br.lines().reduce("", (acc, line) -> acc + line);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}

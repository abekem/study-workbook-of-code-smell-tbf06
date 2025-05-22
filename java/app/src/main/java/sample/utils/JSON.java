package sample.utils;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSON {
    public static Map<String, String> parse(String json) {
        Map<String, String> map = new HashMap<>();
        try {
            ObjectMapper mapper = new ObjectMapper();

            // JSON文字列をMapに変換
            TypeReference<HashMap<String, String>> reference = new TypeReference<HashMap<String, String>>() {
            };
            map = mapper.readValue(json, reference);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}

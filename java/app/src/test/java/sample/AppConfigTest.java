package sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppConfigTest {
    @Test
    void IDが取得できること() {
        ApiConfig conf = new ApiConfig();
        assertEquals("api_id_test", conf.getId());
    }

    @Test
    void passwordが取得できること() {
        ApiConfig conf = new ApiConfig();
        assertEquals("api_password_test", conf.getPassword());
    }
}

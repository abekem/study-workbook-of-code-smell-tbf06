package sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConfigManagerTest {
    @Test
    void APIの設定が取得できること() {
        ConfigManager conf = new ConfigManager("api");
        assertEquals("api_id_test", conf.getId());
        assertEquals("api_password_test", conf.getPassword());
    }

    @Test
    void DBの設定が取得できること() {
        ConfigManager conf = new ConfigManager("db");
        assertEquals("db_id_test", conf.getId());
        assertEquals("db_password_test", conf.getPassword());
    }
}

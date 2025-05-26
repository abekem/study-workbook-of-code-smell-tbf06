package sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DbConfigTest {
    @Test
    void IDが取得できること() {
        DbConfig conf = new DbConfig();
        assertEquals("db_id_test", conf.getId());
    }

    @Test
    void Passwordが取得できること() {
        DbConfig conf = new DbConfig();
        assertEquals("db_password_test", conf.getPassword());
    }
}

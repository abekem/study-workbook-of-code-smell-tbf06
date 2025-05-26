package sample;

// DBの設定を使用するDBクラス
public class Db {
    private DbConfig conf;

    public Db(DbConfig conf) {
        this.conf = conf;
    }

    public String selectAllUser() {
        String id = conf.getId();
        String password = conf.getPassword();

        // APIを使用してユーザーリストを返すモック
        return "[{\"id\" => 1,\"name\" => \"user1\"}]";
    }
}

package sample;

// DBの設定を使用するDBクラス
public class Db {
    private ConfigInterface conf;

    public Db(ConfigInterface conf) {
        this.conf = conf;
    }

    public String getUserList() {
        String id = conf.getUser();
        String password = conf.getPassword();

        // APIを使用してユーザーリストを返すモック
        return "[{\"id\" => 1,\"name\" => \"user1\"}]";
    }
}

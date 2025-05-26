package sample;

// APIの設定を使用するAPIクラス
public class Api {
    private ApiConfig conf;

    public Api(ApiConfig conf) {
        this.conf = conf;
    }
    
    public String getUserList() {
        String id = conf.getId();
        String password = conf.getPassword();
        
        // APIを使用してユーザーリストを返すモック
        return "[{\"id\" => 1,\"name\" => \"user1\"}]";
    }
}

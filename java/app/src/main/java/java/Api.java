package main.java.java;

public class Api {
    private ApiConfig conf;

    public Api(ApiConfig conf) {
        this.conf = conf;
    }
    
    public String getUserList() {
        String id = conf.getId();
        String password = conf.getPassword();
        
        // id/passwordでapiを叩いて結果を返す
        // 以下では、モック的に値を返している
        return "[{\"id\" => 1,\"name\" => \"user1\"}]";
    }
}

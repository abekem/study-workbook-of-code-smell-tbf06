package sample;

public class App {
    public static void main(String[] args) {
        Api api = new Api(new ConfigManager("api"));
        System.out.println("api : " + api.getUserList());

        Db db = new Db(new ConfigManager("db"));
        System.out.println("db : " + db.getUserList());
    }
}

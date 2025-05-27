package sample;

public class App {
    public static void main(String[] args) {
        Api api = new Api(new ApiConfig());
        System.out.println("api : " + api.getUserList());

        Db db = new Db(new DbConfig());
        System.out.println("db : " + db.getUserList());
    }
}

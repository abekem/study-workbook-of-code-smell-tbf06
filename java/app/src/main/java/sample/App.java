package sample;

public class App {
    public static void main(String[] args) {
        // APIを使う場合
        UserRepository apiUserRepository = new UserRepository(new Api(new ApiConfig()));
        System.out.println("api : " + apiUserRepository.findAll());

        // DBを使う場合
        UserRepository dbUserRepository = new UserRepository(new Db(new DbConfig()));
        System.out.println("db : " + dbUserRepository.findAll());
    }
}

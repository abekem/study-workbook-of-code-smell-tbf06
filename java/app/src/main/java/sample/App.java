package sample;

public class App {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository(new Api(new ApiConfig()));
        System.out.println("api : " + userRepository.findAll());
    }
}

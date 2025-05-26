package sample;

public class UserRepository {
    private final Api api;
    private final Db db;

    public UserRepository(Api api) {
        this.api = api;
        this.db = null;
    }

    public UserRepository(Db db) {
        this.api = null;
        this.db = db;
    }

    public String findAll() {
        if (api != null) {
            return api.getUserList();
        } else {
            return db.selectAllUser();
        }
    }
}

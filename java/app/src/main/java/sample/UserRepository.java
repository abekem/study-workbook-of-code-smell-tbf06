package sample;

public class UserRepository {
    private final DataStoreInterface dataStore;

    public UserRepository(DataStoreInterface dataStore) {
        this.dataStore = dataStore;
    }

    public String findAll() {
        return dataStore.getUserList();
    }
}

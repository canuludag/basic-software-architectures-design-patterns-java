public class DatabaseHandler {

    private Database mDatabase;

    public DatabaseHandler(Database database) {
        mDatabase = database;
    }

    public void connect() {
        mDatabase.connect();
    }

    public void disconnect() {
        mDatabase.disconnect();
    }

}

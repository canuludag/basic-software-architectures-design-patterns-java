public class App {
    public static void main(String[] args) {
        DatabaseHandler databaseHandler = new DatabaseHandler(new OracleDatabase());
        databaseHandler.connect();
        databaseHandler.disconnect();
    }
}

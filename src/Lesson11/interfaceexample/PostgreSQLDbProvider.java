package Lesson11.interfaceexample;

public class PostgreSQLDbProvider implements DbProvider {

    @Override
    public void connectToDb() {
        //some logic

    }

    @Override
    public void disconnectFromDb() {
        //some logic
    }

    @Override
    public void encryptData() {
        //some logic
    }
}

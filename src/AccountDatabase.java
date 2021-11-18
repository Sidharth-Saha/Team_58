import java.io.*;
import java.util.ArrayList;

public class AccountDatabase implements Serializable {
    private ArrayList<Account> accounts;

    public static void writeToFile(String fileName, AccountDatabase database) throws IOException {
        FileOutputStream fileStream = new FileOutputStream(fileName);
        ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
        objectStream.writeObject(database);
        objectStream.close();
        fileStream.close();
    }

    public static AccountDatabase readFromFile(String fileName) throws IOException, ClassNotFoundException {
        AccountDatabase database = null;
        FileInputStream fileStream = new FileInputStream(fileName);
        ObjectInputStream objectStream = new ObjectInputStream(fileStream);
        database = (AccountDatabase) objectStream.readObject();
        return database;
    }
}

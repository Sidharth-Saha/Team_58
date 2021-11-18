import java.io.*;
import java.util.HashMap;
import java.util.UUID;

public class Database implements Serializable {
    public HashMap<UUID, Person> people;
    public HashMap<UUID, Patient> patients;

    public Database() {
        this.people = new HashMap<>();
        this.patients = new HashMap<>();
    }

    public static Database createFromFile(String fileName) throws IOException, ClassNotFoundException {
        Database database = null;
        FileInputStream fileStream = new FileInputStream(fileName);
        ObjectInputStream objectStream = new ObjectInputStream(fileStream);
        database = (Database) objectStream.readObject();
        objectStream.close();
        fileStream.close();
        return database;
    }

    public static void writeToFile(String fileName, Database database) throws IOException {
        FileOutputStream fileStream = new FileOutputStream(fileName);
        ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
        objectStream.writeObject(database);
    }
}

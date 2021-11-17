import javax.json.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

public class Nurse extends User {
    protected Nurse() {}

    public static void WriteToFile(Nurse nurse, String fileName) throws IOException
    {
        JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
        objectBuilder.add("ID", nurse.id.toString());
        objectBuilder.add("First Name", nurse.firstName);
        objectBuilder.add("Last Name", nurse.lastName);

        JsonWriter writer = Json.createWriter(new FileOutputStream(new File(fileName)));
    }

    public static Nurse LoadFromFile(String fileName) throws IOException {
        JsonReader reader = Json.createReader(new FileInputStream(new File(fileName)));
        JsonObject object = reader.readObject();

        Nurse nurse = new Nurse();
        nurse.id = UUID.fromString(object.getString("ID"));
        nurse.firstName = object.getString("First Name");
        nurse.lastName = object.getString("Last Name");

        return nurse;
    }
}

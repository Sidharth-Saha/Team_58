import javax.json.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

public class Doctor extends User {
    protected Doctor() {}

    public static void WriteToLog(Doctor doctor, String fileName) throws IOException {
        JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
        objectBuilder.add("ID", doctor.id.toString());
        objectBuilder.add("First Name", doctor.firstName);
        objectBuilder.add("Last Name", doctor.lastName);

        JsonWriter writer = Json.createWriter(new FileOutputStream(new File(fileName)));
        writer.write(objectBuilder.build());
    }

    public static Doctor LoadFromFile(String fileName) throws IOException {
        JsonReader reader = Json.createReader(new FileInputStream(new File(fileName)));
        JsonObject object = reader.readObject();

        Doctor doctor = new Doctor();
        doctor.id = UUID.fromString(object.getString("ID"));
        doctor.firstName = object.getString("First Name");
        doctor.lastName = object.getString("Last Name");

        return doctor;
    }
}

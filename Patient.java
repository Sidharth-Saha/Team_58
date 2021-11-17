import javax.json.*;
import java.io.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class Patient extends User {
    protected Date birthday;
    protected double height;
    protected double temperature;
    protected double weight;
    protected double bloodPressure;

    protected Patient() {}

    public Date getBirthday() {
        return birthday;
    }

    public double getHeight() {
        return height;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getWeight() {
        return weight;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public static void WriteToFile(Patient patient, String fileName) throws IOException {
        JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
        objectBuilder.add("ID", patient.id.toString());
        objectBuilder.add("First Name", patient.firstName);
        objectBuilder.add("Last Name", patient.lastName);
        objectBuilder.add("Date of Birth", patient.birthday.toString());
        objectBuilder.add("Height", patient.height);
        objectBuilder.add("Temperature", patient.temperature);
        objectBuilder.add("Weight", patient.weight);
        objectBuilder.add("Blood Pressure", patient.bloodPressure);

        JsonWriter writer = Json.createWriter(new FileOutputStream(new File(fileName)));
        writer.write(objectBuilder.build());
    }

    public static Patient LoadFromFile(String fileName) throws IOException {
        JsonReader reader = Json.createReader(new FileInputStream(new File(fileName)));
        JsonObject object = reader.readObject();

        Patient patient = new Patient();
        patient.id = UUID.fromString(object.getString("ID"));
        patient.firstName = object.getString("First Name");
        patient.lastName = object.getString("Last Name");
        LocalDate date = LocalDate.parse(object.getString("Date of Birth"));

        return patient;
    }
}

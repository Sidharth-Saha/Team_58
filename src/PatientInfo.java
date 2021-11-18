import java.io.Serializable;
import java.util.ArrayList;
import javax.json.*;
import java.io.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;
import javafx.Application;
import javafx.event.ActionEvent;
import javafx.Scene;
import javafx.scene.control.Button;
import javafx.scene.layouut.StackPane;
import javafx.stage.Stage;


public class PatientInfo implements Serializable {
    public String address;
    public Date dateOfBirth;
    public ContactInfo contactInfo;
    public String registeredMedicalPractice;
    public ArrayList<FamilyContact> familyContacts;

    public PatientInfo(String address, Date dateOfBirth, ContactInfo contactInfo, String registeredMedicalPractice, ArrayList<FamilyContact> familyContacts) {
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.contactInfo = contactInfo;
        this.registeredMedicalPractice = registeredMedicalPractice;
        this.familyContacts = familyContacts;
    }
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Patient Info");
        
        primaryStage.show();
    }

GridPane grid = new GridPane();
grid.setAlignment(Pos.CENTER);
grid.setHgap(10);
grid.setVgap(10);
grid.setPadding(new Insets(25, 25, 25, 25));

Scene scene = new Scene(grid, 300, 275);
primaryStage.setScene(scene);

scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
grid.add(scenetitle, 0, 0, 2, 1);

Label userName = new Label("Birthday");
grid.add(Birthday, 0, 1);
TextField BDay = new TextField();
grid.add(BDay, 1, 1);

Label userName = new Label("Height");
grid.add(Height, 0, 2);
TextField H1 = new TextField();
grid.add(H1, 1, 2);

Label userName = new Label("Temperature");
grid.add(Temperature, 0, 3);
TextField temp = new TextField();
grid.add(temp, 1, 3);

Label userName = new Label("Weight");
grid.add(Weight, 0, 4);
TextField W = new TextField();
grid.add(W, 1, 4);

Label userName = new Label("Bloodpressure");
grid.add(Bloodpressure, 0, 5);
TextField BP = new TextField();
grid.add(BP, 1, 5);

    Button btn = new Button();
btn.setText("Update");
grid.add(btn, 0, 6);
btn.setOnAction(new EventHandler() {
	public void handle(ActionEvent event) {
		this.birthday = birthday;
		this.height = height;
		this.temperature = temperature;
		this.weight = weight;
		this.bloodPressure = bloodPressure;
}
}   
}

package project360;
import javax.json.*;

import javafx.geometry.Insets;
import javafx.geometry.Pos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

import javafx.scene.Scene;
import javafx.scene.control.Button; 
import javafx.scene.text.Text; 
import javafx.scene.control.CheckBox; 
import javafx.scene.control.TextField; 
import javafx.scene.control.ToggleButton; 
import javafx.stage.Stage; 
import javafx.scene.layout.GridPane; 

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
    public void start(Stage stage) {
    	stage.setTitle("Nurse");
    	
    	stage.show();
    	
    	Text labelweight=new Text("Weight of Patient");
    	TextField weightbox=new TextField();
    	
    	Text labelheight=new Text("Height of Patient");
    	TextField heightbox=new TextField();
    	
    	Text labeltemperature=new Text("Body Temperature");
    	TextField temperaturebox=new TextField();
    
    	Text labelpressure=new Text("Blood Pressure");
    	TextField pressurebox=new TextField();
    
    	Text labelallergies=new Text("Allergies of Patient");
    	TextField allergiesbox=new TextField();
    	
    	Text labelhealth=new Text("Any health concern of Patient");
    	TextField healthbox=new TextField();
    	
    	Text labelmed=new Text("Previous prescribed Medication");
    	TextField medbox=new TextField();
    	
    	Text labelvacc=new Text("History of Patient Vaccionation");
    	TextField vaccbox=new TextField();
    	
    	GridPane grid=new GridPane();
    	grid.setPadding(new Insets(20,20,20,20));
    	grid.setAlignment(Pos.CENTER);
    	
    	grid.setVgap(10);
    	grid.setHgap(10);
    	
    	Scene scene=new Scene(grid);
    	stage.setScene(scene);
    	
    	grid.add(labelweight,0,0);
    	grid.add(weightbox,1,0);
    	
    	grid.add(labelheight,0,1);
    	grid.add(heightbox,1,1);
    	
    	grid.add(labeltemperature,0,2);
    	grid.add(temperaturebox,1,2);
    	
    	grid.add(labelpressure,2,2);
    	grid.add(pressurebox,0,3);
    	
    	grid.add(labelallergies,1,3);
    	grid.add(allergiesbox,2,3);
    	
    	grid.add(labelhealth,0,4);
    	grid.add(healthbox,1,4);
    	
    	grid.add(labelmed,2,4);
    	grid.add(medbox,0,5);
    	
    	grid.add(labelvacc,1,5);
    	grid.add(vaccbox,0,6);
}
}


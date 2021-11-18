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
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.scene.control.SelectionMode;
import javafx.stage.Stage;
public class Database extends User {
	public void start(Stage primaryStage)throws Exception {
		primaryStage.setTitle("Database");
		ListView<Message> listView = new ListView<>();
		listView.getItems().add("Patient");

		Button button = new Button("Patient");

		button.setOnAction(event -> {
            ObservableList selectedIndices = ListView.getSelectionModel().getSelectedItem();

		VBox vBox = new VBox(listView, button);

		        Scene scene = new Scene(vBox, 300, 120);
		        primaryStage.setScene(scene);
        primaryStage.show();
	}
	public static void main(String[] args) {
	        Application.launch(args);
	    }
}
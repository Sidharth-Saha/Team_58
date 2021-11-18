import java.io.Serializable;
import java.util.UUID;

public class Person implements Serializable {
    public UUID id;
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

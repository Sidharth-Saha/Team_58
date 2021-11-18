import java.io.Serializable;

public class FamilyContact implements Serializable {
    public String firstName;
    public String lastName;
    public String phoneNumber;

    public FamilyContact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
}

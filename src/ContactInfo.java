import java.io.Serializable;

public class ContactInfo implements Serializable {
    public String email;
    public String phoneNumber;

    public ContactInfo(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}

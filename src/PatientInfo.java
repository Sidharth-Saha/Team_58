import java.io.Serializable;
import java.util.ArrayList;

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
}

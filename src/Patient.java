import java.util.ArrayList;

public class Patient extends Person {
    public PatientInfo patientInfo;
    public String riskAssessment;
    public ArrayList<String> diagnoses;
    public ArrayList<String> treatments;
    public ArrayList<String> prescriptions;
    public ArrayList<String> consultations;
    public ArrayList<String> referrals;

    public Patient(String firstName, String lastName, PatientInfo patientInfo, String riskAssessment, ArrayList<String> diagnoses, ArrayList<String> treatments,
                   ArrayList<String> prescriptions, ArrayList<String> consultations, ArrayList<String> referrals) {
        super(firstName, lastName);
        this.patientInfo = patientInfo;
        this.riskAssessment = riskAssessment;
        this.diagnoses = diagnoses;
        this.treatments = treatments;
        this.prescriptions = prescriptions;
        this.consultations = consultations;
        this.referrals = referrals;
    }
}

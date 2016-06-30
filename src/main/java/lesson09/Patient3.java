package lesson09;

/**
 * Created by lapte on 21.05.2016.
 */
public class Patient3 extends Human {

    private int medicalCardNumber;
    private String diagnoz;

    public Patient3(int id, String lastName, String firstName, String otchestvo, int dayOfBirth, int monthOfBirth, int yearOfBirth, String address, String telephone, int medicalCardNumber, String diagnoz) {
        super(id, lastName, firstName, otchestvo, 1, 1, 2000, address, telephone);
        setMedicalCardNumber(medicalCardNumber);
        setDiagnoz(diagnoz);
    }

    public int getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public void setMedicalCardNumber(int medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber;
    }

    public String getDiagnoz() {
        return diagnoz;
    }

    public void setDiagnoz(String diagnoz) {
        this.diagnoz = diagnoz;
    }


    @Override
    public String toString() {
        return "Patient3{" +  super.toString() +
                ", medicalCardNumber= " + medicalCardNumber +
                ", diagnoz= " + diagnoz +
                '}';
    }
}

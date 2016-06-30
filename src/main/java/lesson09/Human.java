package lesson09;

/**
 * Created by lapte on 21.05.2016.
 */
public abstract class Human {
    private int id;
    private String lastName;
    private String firstName;
    private String otchestvo;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String address;
    private String telephone;

    public Human(int id, String lastName, String firstName, String otchestvo, int dayOfBirth, int monthOfBirth, int yearOfBirth, String address, String telephone) {
        setId(id);
        setLastName(lastName);
        setFirstName(firstName);
        setOtchestvo(otchestvo);
        setDayOfBirth(dayOfBirth);
        setMonthOfBirth(monthOfBirth);
        setYearOfBirth(yearOfBirth);
        setAddress(address);
        setTelephone(telephone);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", lastName= " + lastName +
                ", firstName= " + firstName +
                ", otchestvo= " + otchestvo +
                ", dayOfBirth= " + dayOfBirth +
                ", monthOfBirth= " + monthOfBirth +
                ", yearOfBirth= " + yearOfBirth +
                ", address= " + address +
                ", telephone= " + telephone + " ";
    }
}

package lesson09;

import java.util.Comparator;

/**
 * Created by lapte on 23.05.2016.
 */
public class Phone7 extends Human {

    private int creditCardNumber;
    private int debit;
    private int credit;
    private int timeOfTheCityCalls;
    private int timeOfTheIntercityCalls;


    public Phone7(int id, String lastName, String firstName, String otchestvo,
                  int dayOfBirth, int monthOfBirth, int yearOfBirth, String address,
                  String telephone, int creditCardNumber, int debit, int credit,
                  int timeOfTheCityCalls, int timeOfTheIntercityCalls) {
        super(id, lastName, firstName, otchestvo, 1, 1,
                2000, address, "111");
        setCreditCardNumber(creditCardNumber);
        setDebit(debit);
        setCredit(credit);
        setTimeOfTheCityCalls(timeOfTheCityCalls);
        setTimeOfTheIntercityCalls(timeOfTheIntercityCalls);
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getTimeOfTheCityCalls() {
        return timeOfTheCityCalls;
    }

    public void setTimeOfTheCityCalls(int timeOfTheCityCalls) {
        this.timeOfTheCityCalls = timeOfTheCityCalls;
    }

    public int getTimeOfTheIntercityCalls() {
        return timeOfTheIntercityCalls;
    }

    public void setTimeOfTheIntercityCalls(int timeOfTheIntercityCalls) {
        this.timeOfTheIntercityCalls = timeOfTheIntercityCalls;
    }


    @Override
    public String toString() {
        return "Phone7{" + super.toString() +
                " creditCardNumber= " + getCreditCardNumber() +
                ", debit= " + getDebit() +
                ", credit= " + getCredit() +
                ", timeOfTheCityCalls= " + getTimeOfTheCityCalls() +
                ", timeOfTheIntercityCalls= " + getTimeOfTheIntercityCalls() +
                '}';
    }

    public class AbonentComparator implements Comparator<Phone7> {

        @Override
        public int compare(Phone7 o1, Phone7 o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }
}

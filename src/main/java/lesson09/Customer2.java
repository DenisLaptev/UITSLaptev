package lesson09;

import java.util.Comparator;

/**
 * Created by lapte on 21.05.2016.
 */
public class Customer2 extends Human {
    private int cardNumber;
    private String bankAccount;

    public Customer2(int id, String lastName, String firstName, String otchestvo, int dayOfBirth, int monthOfBirth, int yearOfBirth, String address, String telephone, int cardNumber, String bankAccount) {
        super(id, lastName, firstName, otchestvo, 1, 1, 2000, address, "111");
        setCardNumber(cardNumber);
        setBankAccount(bankAccount);
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Customer2{"  + super.toString() +
                ", cardNumber= " + cardNumber +
                ", bankAccount= " + bankAccount +
                "}";
    }

    public class CustomerComparator implements Comparator<Customer2> {

        @Override
        public int compare(Customer2 o1, Customer2 o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }
}



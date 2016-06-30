package lesson09;

/**
 * Created by lapte on 27.05.2016.
 */
public class Bus11 {

    private String lastNameOfDriver;
    private String firstNameOfDriver;
    private String otchestvoOfDriver;
    private int numberOfTheBus;
    private int numberOfTheTravel;
    private String marka;
    private int yearOfUsageBegginning;
    final static int CURRENT_YEAR = 2016;
    private int timeOfUsage;
    private int kilometers;


    public Bus11(String lastNameOfDriver, String firstNameOfDriver,
                 String otchestvoOfDriver, int numberOfTheBus,
                 int numberOfTheTravel, String marka,
                 int yearOfUsageBegginning, int kilometers) {
        setLastNameOfDriver(lastNameOfDriver);
        setFirstNameOfDriver(firstNameOfDriver);
        setOtchestvoOfDriver(otchestvoOfDriver);
        setNumberOfTheBus(numberOfTheBus);
        setNumberOfTheTravel(numberOfTheTravel);
        setMarka(marka);
        setYearOfUsageBegginning(yearOfUsageBegginning);
        setTimeOfUsage();
        setKilometers(kilometers);
    }

    public String getLastNameOfDriver() {
        return lastNameOfDriver;
    }

    public void setLastNameOfDriver(String lastNameOfDriver) {
        this.lastNameOfDriver = lastNameOfDriver;
    }

    public String getFirstNameOfDriver() {
        return firstNameOfDriver;
    }

    public void setFirstNameOfDriver(String firstNameOfDriver) {
        this.firstNameOfDriver = firstNameOfDriver;
    }

    public String getOtchestvoOfDriver() {
        return otchestvoOfDriver;
    }

    public void setOtchestvoOfDriver(String otchestvoOfDriver) {
        this.otchestvoOfDriver = otchestvoOfDriver;
    }

    public int getNumberOfTheBus() {
        return numberOfTheBus;
    }

    public void setNumberOfTheBus(int numberOfTheBus) {
        this.numberOfTheBus = numberOfTheBus;
    }

    public int getNumberOfTheTravel() {
        return numberOfTheTravel;
    }

    public void setNumberOfTheTravel(int numberOfTheTravel) {
        this.numberOfTheTravel = numberOfTheTravel;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getYearOfUsageBegginning() {
        return yearOfUsageBegginning;
    }

    public void setYearOfUsageBegginning(int yearOfUsageBegginning) {
        this.yearOfUsageBegginning = yearOfUsageBegginning;
    }

    public int getTimeOfUsage() {
        return timeOfUsage;
    }

    public void setTimeOfUsage() {
        this.timeOfUsage = CURRENT_YEAR - getYearOfUsageBegginning();
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }


    @Override
    public String toString() {
        return "Bus11{" +
                " lastNameOfDriver= " + getLastNameOfDriver() +
                ", firstNameOfDriver= " + getFirstNameOfDriver() +
                ", otchestvoOfDriver= " + getOtchestvoOfDriver() +
                ", numberOfTheBus= " + getNumberOfTheBus() +
                ", numberOfTheTravel= " + getNumberOfTheTravel() +
                ", marka= " + getMarka() +
                ", yearOfUsageBegginning= " + getYearOfUsageBegginning() +
                ", timeOfUsage= " + getTimeOfUsage() +
                ", kilometers= " + getKilometers() +
                '}';
    }
}

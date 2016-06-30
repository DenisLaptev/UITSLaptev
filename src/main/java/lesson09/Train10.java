package lesson09;

/**
 * Created by lapte on 23.05.2016.
 */
public class Train10 {
    /*
    Convert String to Date:
    SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
	String dateInString = "31-08-1982 10:20:56";
	Date date = sdf.parse(dateInString);
	System.out.println(date); //Tue Aug 31 10:20:56 SGT 1982
     */


    private String destination;
    private int numberOfTheTrain;
    private int timeOfLeaving;
    private int numberOfAllSeats;
    private int numberOfCupeSeats;
    private int numberOfPltzcartSeats;
    private int numberOfLuxSeats;

    public Train10(String destination, int numberOfTheTrain,
                   int timeOfLeaving, int numberOfAllSeats,
                   int numberOfCupeSeats, int numberOfPltzcartSeats,
                   int numberOfLuxSeats) {
        setDestination(destination);
        setNumberOfTheTrain(numberOfTheTrain);
        setTimeOfLeaving(timeOfLeaving);
        setNumberOfAllSeats(numberOfAllSeats);
        setNumberOfCupeSeats(numberOfCupeSeats);
        setNumberOfPltzcartSeats(numberOfPltzcartSeats);
        setNumberOfLuxSeats(numberOfLuxSeats);
    }


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumberOfTheTrain() {
        return numberOfTheTrain;
    }

    public void setNumberOfTheTrain(int numberOfTheTrain) {
        this.numberOfTheTrain = numberOfTheTrain;
    }

    public int getTimeOfLeaving() {
        return timeOfLeaving;
    }

    public void setTimeOfLeaving(int timeOfLeaving) {
        this.timeOfLeaving = timeOfLeaving;
    }

    public int getNumberOfAllSeats() {
        return numberOfAllSeats;
    }

    public void setNumberOfAllSeats(int numberOfAllSeats) {
        this.numberOfAllSeats = numberOfAllSeats;
    }

    public int getNumberOfCupeSeats() {
        return numberOfCupeSeats;
    }

    public void setNumberOfCupeSeats(int numberOfCupeSeats) {
        this.numberOfCupeSeats = numberOfCupeSeats;
    }

    public int getNumberOfPltzcartSeats() {
        return numberOfPltzcartSeats;
    }

    public void setNumberOfPltzcartSeats(int numberOfPltzcartSeats) {
        this.numberOfPltzcartSeats = numberOfPltzcartSeats;
    }

    public int getNumberOfLuxSeats() {
        return numberOfLuxSeats;
    }

    public void setNumberOfLuxSeats(int numberOfLuxSeats) {
        this.numberOfLuxSeats = numberOfLuxSeats;
    }


    @Override
    public String toString() {
        return "Train10{" +
                " destination= " + getDestination() +
                ", numberOfTheTrain= " + getNumberOfTheTrain() +
                ", timeOfLeaving= " + getTimeOfLeaving() +
                ", numberOfAllSeats= " + getNumberOfAllSeats() +
                ", numberOfCupeSeats= " + getNumberOfCupeSeats() +
                ", numberOfPltzcartSeats= " + getNumberOfPltzcartSeats() +
                ", numberOfLuxSeats= " + getNumberOfLuxSeats() +
                '}';
    }
}

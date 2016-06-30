package lesson09;

/**
 * Created by lapte on 27.05.2016.
 */
public class Airline12 {
    private String destination;
    private int numberOfTheFlight;
    private String typeOfTheAirplane;
    private int timeOfLeaving;
    private String dayOfTheWeek;


    public Airline12(String destination, int numberOfTheFlight,
                     String typeOfTheAirplane, int timeOfLeaving,
                     String dayOfTheWeek) {
        setDestination(destination);
        setNumberOfTheFlight(numberOfTheFlight);
        setTypeOfTheAirplane(typeOfTheAirplane);
        setTimeOfLeaving(timeOfLeaving);
        setDayOfTheWeek(dayOfTheWeek);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumberOfTheFlight() {
        return numberOfTheFlight;
    }

    public void setNumberOfTheFlight(int numberOfTheFlight) {
        this.numberOfTheFlight = numberOfTheFlight;
    }

    public String getTypeOfTheAirplane() {
        return typeOfTheAirplane;
    }

    public void setTypeOfTheAirplane(String typeOfTheAirplane) {
        this.typeOfTheAirplane = typeOfTheAirplane;
    }

    public int getTimeOfLeaving() {
        return timeOfLeaving;
    }

    public void setTimeOfLeaving(int timeOfLeaving) {
        this.timeOfLeaving = timeOfLeaving;
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(String dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }


    @Override
    public String toString() {
        return "Airline12{" +
                " destination= " + destination +
                ", numberOfTheFlight= " + numberOfTheFlight +
                ", typeOfTheAirplane= " + typeOfTheAirplane +
                ", timeOfLeaving= " + timeOfLeaving +
                ", dayOfTheWeek= " + dayOfTheWeek +
                '}';
    }
}

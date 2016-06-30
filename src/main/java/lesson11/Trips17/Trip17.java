package lesson11.Trips17;

import java.util.Comparator;

/**
 * Created by lapte on 11.05.2016.
 */
public class Trip17 {
    private String type; // type of the trip
    private boolean food; // food
    private int days;
    private String transport;
    private String destination;

    public Trip17(String type, boolean food, int days, String transport, String destination) {
        this.type = type;
        this.food = food;
        this.days = days;
        this.transport = transport;
        this.destination = destination;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Trip{" + "type=" + type + ", food=" + food + ", days=" + days + ", transport=" + transport + ", destination=" + destination + '}';
    }

    public class TripTypeComparator implements Comparator<Trip17> {

        @Override
        public int compare(Trip17 o1, Trip17 o2) {
            return o1.type.compareTo(o2.type);
        }
    }
}

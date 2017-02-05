/**
 * Created by Olenkaa on 04.02.2017.
 */
public class TaxiRide {
    private int passengers;
    private double distance;
    private double duration;

    public TaxiRide(int passengers, double distance, double duration) {
        this.passengers = passengers;
        this.distance = distance;
        this.duration = duration;
    }
    public TaxiRide(){


    }

    @Override
    public String toString() {
        return "TaxiRide{" +
                "passengers=" + passengers +
                ", distance=" + distance +
                ", duration=" + duration +
                '}';
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(){
        this.passengers = passengers;
    }

    public double getDistance() {
        return distance;
    }


    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }


}

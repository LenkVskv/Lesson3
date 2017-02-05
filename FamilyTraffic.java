/**
 * Created by Olenkaa on 04.02.2017.
 */
public class FamilyTraffic implements TaxiTariff {
    public long calculate(TaxiRide t){
        return (long) ( 50 + 20 * (t.getDistance() / t.getPassengers()));

    }
}

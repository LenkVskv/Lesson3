/**
 * Created by Olenkaa on 04.02.2017.
 */
public  class StandartTariff implements TaxiTariff {
    public long calculate(TaxiRide t){
    return (long) (30 + 5 * t.getDistance() + 2 * t.getDuration());
    }
}

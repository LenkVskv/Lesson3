import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olenkaa on 04.02.2017.
 */
public class TaxiRides {

    private List<TaxiRide> taxiRides = new ArrayList<>();

    public void add(TaxiRide taxiRide) {
        taxiRides.add(taxiRide);

    }

    public long getPrice (TaxiTariff tariff) {
        long price = 0;
        for (TaxiRide t : taxiRides){
            price += tariff.calculate(t);
        }
       return price;
    }

}



/**
 * Created by Olenkaa on 04.02.2017.
 */
public class Main {
    public static void main(String args[]){
        TaxiRide taxiRide = new TaxiRide(10, 3,10);
        TaxiRide taxiRide1 = new TaxiRide(5,30,50);
        TaxiRides taxiRides = new TaxiRides();
        taxiRides.add(taxiRide);
        StandartTariff standartTariff = new StandartTariff();
        FamilyTraffic familyTraffic = new FamilyTraffic();


        System.out.println(taxiRides.getPrice(new StandartTariff()));
        System.out.print(taxiRides.getPrice( new FamilyTraffic()));
    }
}

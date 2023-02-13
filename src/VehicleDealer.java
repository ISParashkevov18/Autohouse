public class VehicleDealer {
    private Vehicle vehicle;
    private Dealer dealer;

    public VehicleDealer(Vehicle vehicle, Dealer dealer) {
        this.vehicle = vehicle;
        this.dealer = dealer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public void displayDetails() {

    }
}
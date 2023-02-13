public class Vehicle {
    private int VIN;
    public String vehicleModel;
    public String vehicleMake;
    public int vehicleHorsePower;
    public double vehiclePrice;

    public Vehicle(){
        this.VIN = 1;
        this.vehicleModel="Civic";
        this.vehicleMake="Honda";
        this.vehicleHorsePower=120;
        this.vehiclePrice=12000.00;
    }

    public Vehicle(int VIN, String vehicleModel, String vehicleMake, int vehicleHorsePower, double vehiclePrice) {
        this.VIN = VIN;
        this.vehicleModel = vehicleModel;
        this.vehicleMake = vehicleMake;
        this.vehicleHorsePower = vehicleHorsePower;
        this.vehiclePrice = vehiclePrice;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public int getVehicleHorsePower() {
        return vehicleHorsePower;
    }

    public void setVehicleHorsePower(int vehicleHorsePower) {
        this.vehicleHorsePower = vehicleHorsePower;
    }

    public double getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(double vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "VIN=" + VIN +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleMake='" + vehicleMake + '\'' +
                ", vehicleHorsePower=" + vehicleHorsePower +
                ", vehiclePrice=" + vehiclePrice +
                '}';
    }

    }

public class Motorcycle {
    public int motorcycleTireCount;
    public int motorcycleFuel;

    public Motorcycle(){
        this.motorcycleTireCount = 2;
        this.motorcycleFuel = 64;
    }

    public Motorcycle(int motorcycleTireCount, int motorcycleFuel) {
        this.motorcycleTireCount = motorcycleTireCount;
        this.motorcycleFuel = motorcycleFuel;
    }

    public int getMotorcycleTireCount() {
        return motorcycleTireCount;
    }

    public void setMotorcycleTireCount(int motorcycleTireCount) {
        this.motorcycleTireCount = motorcycleTireCount;
    }

    public int getMotorcycleFuel() {
        return motorcycleFuel;
    }

    public void setMotorcycleFuel(int motorcycleFuel) {
        this.motorcycleFuel = motorcycleFuel;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "motorcycleTireCount=" + motorcycleTireCount +
                ", motorcycleFuel=" + motorcycleFuel +
                '}';
    }
}
package innerclass.interfcaeinclass;

public class Bus implements VehicleType.Vehicle {

    @Override
    public int getNumberOfWheel() {
        return 4;
    }

    public static void main(String[] args) {
        System.out.println(new Bus().getNumberOfWheel());
    }
}

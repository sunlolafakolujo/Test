package objectmathods.shallowanddeepcloning;

public class Address {
    String streetNumber;
    String streetName;
    String city;

    public Address() {
    }

    public Address(String streetNumber, String streetName, String city) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetNumber='" + streetNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

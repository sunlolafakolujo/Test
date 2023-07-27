package oopsconcept;

import java.util.Objects;

public class Customer extends Users{
    String customerName;

    public Customer(String id, String username, String password, String email, String mobile, String customerName) {
        super(id, username, password, email, mobile);
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(getCustomerName(), customer.getCustomerName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCustomerName());
    }


    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}

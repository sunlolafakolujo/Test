package oopsconcepts.inheritanceconcept;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Customer extends AppUsers {
    String customerName;
    LocalDate dateEstablished;

    public Customer(String id, String username, String password, String email, String mobile, String customerName, LocalDate dateEstablished) {
        super(id, username, password, email, mobile);
        this.customerName = customerName;
        this.dateEstablished =dateEstablished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerName, customer.customerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), customerName);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", customerName='" + customerName + '\'' +
                ", dateEstablished='" + dateEstablished + '\'' +
                '}';
    }
}

package oopsconcept;

import java.util.Objects;

public abstract class Users {
    String id;
    String username;
    String password;
    String email;
    String mobile;

    public Users() {
        System.out.println("Customer contact details");
    }

    public Users(String id, String username, String password, String email, String mobile) {
        this();
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}

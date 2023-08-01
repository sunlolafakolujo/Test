package oopsconcepts.inheritanceconcept;

public abstract class AppUsers {
    volatile String id;
    public String username;
    String password;
    String email;
    protected String mobile;

    public AppUsers(String id, String username, String password, String email, String mobile) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
    }
}

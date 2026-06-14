package Structural.facade;

public class User {
    private String name;
    private String email;
    private String phoneNo;

    public User(String name, String email, String phoneNo) {
        this.name = name;
        this.email = email;
        this.phoneNo= phoneNo;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public  String getPhone(){
        return phoneNo;
    }
}

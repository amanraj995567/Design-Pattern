package Structural.adapter;

public class SchoolStudent {
    private String firstname;
    private String lastname;
    private String emailaddress;

    public SchoolStudent(String firstname,String lastname,String  emaiaddress){
        this.firstname= firstname;
        this.lastname= lastname;
        this.emailaddress = emailaddress;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public String getEmailaddress(){
        return emailaddress;
    }
}

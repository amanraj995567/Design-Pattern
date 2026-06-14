package Structural.adapter;

public class SchoolStudentAdapter implements Student{

    private SchoolStudent schoolStudent;

    public SchoolStudentAdapter(SchoolStudent schoolStudent){
        this.schoolStudent = schoolStudent;
    }

    @Override
    public String getName() {
        return schoolStudent.getFirstname();
    }

    @Override
    public String getSurname() {
        return schoolStudent.getLastname();
    }

    @Override
    public String getEmail() {
        return schoolStudent.getEmailaddress();
    }
}

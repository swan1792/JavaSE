package university.model;

public class StudentName {
    private String firstName;
    private String secondName;

    public StudentName(String fname, String sName){
        this.firstName = fname;
        this.secondName = sName;
    }

    public String getFullName(){
        return firstName + " " + secondName;
    }
}

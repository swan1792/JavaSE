package university.model;

public class Student {
    private final int id;
    private StudentName name;
    private Address address;

    public Student(int id, StudentName name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void displayStudentInfo(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name.getFullName());
        System.out.println("Address: " + address.getFullAddress());
    }
}

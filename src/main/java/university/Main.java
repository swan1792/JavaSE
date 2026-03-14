package university;
import university.model.*;
import university.UI.*;
import university.action.*;

public class Main {
    static void main() {
        StudentName sName = new StudentName("Aung", "Kyaw");
        Address sAddr = new Address("No. 123, Pyay Road", "Yangon", "11011" );
        Student student = new Student(2026001, sName, sAddr);

        EnrollButton enrollBtn = new EnrollButton();

        System.out.println("__ Universtiy Management System ---");
        student.displayStudentInfo();

        System.out.println("\n--- User Interface Action ---");
        enrollBtn.render();
        enrollBtn.onClick();
        enrollBtn.onHover();

        if(enrollBtn instanceof EnrollButton){
            ((EnrollButton) enrollBtn).onClick();
        }

    }
}

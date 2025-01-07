package unit2;

public class Unit2Day0 {

    public static void main(String[] args) {
        System.out.println("Hello");
        Student student1 = new Student();
        Student student2 = new Student(30, 123456789, 'f', "Merry", "merry@gmail.com");
        student1.roleNumber = 1;
        student1.name = "John";
        student1.phoneNumber = 900009000;
        student1.emailId = "john@gmail.com";
        student1.gender = 'm';

        System.out.println(student1.roleNumber);
        System.out.println(student2.roleNumber);
    }

}

class Student{
    int roleNumber, phoneNumber;
    char gender;
    String name, emailId;

    public Student(){
        System.out.println("Default Student Created");
    }

    public Student(int roleNumber, int phoneNumber, char gender, String name, String emailId) {
        this.roleNumber = roleNumber;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.name = name;
        this.emailId = emailId;
    }
}
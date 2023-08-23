public class Student {

    int id;
    String firstName;
    String lastName;
    String phone;
    int age;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, String phone, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
    }

    public void printId(){
        System.out.println("This student's id is " + this.id);
    }

    public void printFirstName(){
        System.out.println("This student's firstname is " + this.firstName);
    }

    public void printLastName(){
        System.out.println("This student's id is " + this.lastName);
    }

    public void printPhone(){
        System.out.println("This student's phone number is " + this.phone);
    }

    public void printAge(){
        System.out.println("This student's age is " + this.age);
    }
}

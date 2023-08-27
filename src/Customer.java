import java.time.LocalDate;

public class Customer {

    static int counter = 1;
    int id;
    String name;
    LocalDate registerDate;

    public Customer() {
    }

    public Customer(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Customer(String name){
        this.name = name;
        this.id = counter++;
        this.registerDate = LocalDate.now();
    }

    public void printName(){
        System.out.println("This customer's name is " + this.name);
    }

    public static void printClassName(){
        System.out.println("This class name is Customer");

    }
}

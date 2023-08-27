

public class Main {

    public static void main(String[] args){

        User user1 = new User(); // id = 0, name = null
        User user2 = new User(2,"Marry","054",(byte)20);
        User user3 = new User(3);
        User user4 = new User("Mike");
        User user5 = new User(5,"Jack","123",(byte)-3);
//        System.out.println(user1.id);
//        System.out.println(user1.name);
//        System.out.println("______");
//        user1.id = 1;
//        user1.name = "Tom";
//        System.out.println(user1.id);
//        System.out.println(user1.name);

//        System.out.println(user2.name);
//
//        user1.printName();
//        user2.printName();
//
//        User.printClassName();
//
//        System.out.println(User.staticInt);

        Course qa = new Course("QA",3);
        Course fullstack = new Course("Fullstack",3);

        Student s1 = new Student(1,"A","AA","123",20);
        Student s2 = new Student(2,"B","BB","456",35);
        Student s3 = new Student(3,"C","CC","789",23);
        Student s4 = new Student(3,"D","DD","123",30);

//        fullstack.registerStudent(s1);
//        fullstack.registerStudent(s2);
//        fullstack.registerStudent(s3);
//        fullstack.registerStudent(s4);

        Customer c1 = new Customer();
        Customer c2 = new Customer(2,"Tom");
        Customer c3 = new Customer("Marry");
        Customer c4 = new Customer("Harry");

//        System.out.println(c3.name);
//        System.out.println(c3.id);
//        System.out.println(c3.registerDate);
//        System.out.println("_______");
//        System.out.println(c4.name);
//        System.out.println(c4.id);
//        System.out.println(c4.registerDate);











    }




}
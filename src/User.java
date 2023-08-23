public class User {

    static int staticInt = 1;
    int id;
    String name;
    String phone;
    byte age;

    public User() {
    }

    public User(int id, String name, String phone, byte age) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        if(age <= 0){
            this.age = 1;
        }else{
            this.age = age;
        }
        staticInt++;
    }

    public User(int id) {
        this.id = id;
    }

    public User(String name) {
        this.name = name;
    }

//    public User(String phone){
//        this.phone = phone;
//    }

    public void printName(){
        System.out.println("This user's name is " + this.name);
    }

    public static void printClassName(){
        System.out.println("Tis class name is USER");
    }

}


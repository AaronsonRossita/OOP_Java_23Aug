public class Course {

    int counter;
    String courseName;
    int size;
    Student[] registeredStudents;

    public Course(String courseName, int size) {
        this.courseName = courseName;
        this.size = size;
        this.registeredStudents = new Student[size];
        this.counter = 0;
    }

    public void registerStudent(Student student){
        if(this.counter < size){
            registeredStudents[counter] = student;
            System.out.println("Congratulations, " + student.firstName + " you are registered in " + this.courseName + " course");
            counter++;
        }else{
            System.out.println("Sorry, " + student.firstName + " this " + this.courseName + " course is full");
        }
    }
}

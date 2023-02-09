package TeacherArray;


public class Tester {
    public static void main(String[] args) {
        Teacher[] teachers = new Teacher[4];
        teachers[0] = new Teacher("Alex", "Java Fundamentals", 1200.0);
        teachers[1] = new Teacher("John", "RDBMS", 800.0);
        teachers[2] = new Teacher("Sam", "Networking", 900.0);
        teachers[3] = new Teacher("Maria", "Python", 900.0);
        
        for (Teacher teacher : teachers) {
            System.out.println("Name: " + teacher.getTeacherName() + ", Subject: " + teacher.getSubject() + ", Salary: " + teacher.getSalary());
        }
    }
}

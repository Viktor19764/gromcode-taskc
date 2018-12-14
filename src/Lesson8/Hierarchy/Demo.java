package Lesson8.Hierarchy;

public class Demo {
    String firstName;
    String lastName;
    int group;
    Course[] coursesTaken;
    int age;
    long secretKey;
    String email;

    static Student createHighestParent() {
        return new Student("Mykola", "Mykolayenko", 1, new Course[5]);
    }

    static SpecialStudent createLowestChild() {
        //Course[] coursesArray = new Course[] ();
        return new SpecialStudent("Mykola", "Mykolayenko", 1, new Course[5], 675435674, "mail@mail.com");
    }
}

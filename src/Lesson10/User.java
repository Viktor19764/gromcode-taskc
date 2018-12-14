package Lesson10;

public class User extends Human {

    public User(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("User class called...");
        super.run();
    }
}

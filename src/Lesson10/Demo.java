package Lesson10;

public class Demo {
    public static void main(String[] args) {
        Human human = new Human("Test");
        run(human);

    }

    private static void run(Human human){
        human.run();
    }
}

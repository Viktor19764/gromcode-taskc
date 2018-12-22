package lesson9.HW;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        User user = new User(1001, "Ann", "1w1212");
        userRepository.save(user);
        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        userRepository.save(user);
        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        //test save()
        //збереження юзера +
        //збереження того ж юзера +
        //коли немає місця у масиві +
        //коли зберігаємо null +

        int n = 15;
        while (n > 0) {
            User user1 = new User(n, "Ann", "1w21212");
            userRepository.save(user);
            n--;
        }

        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        userRepository.save(null);

        //test update

        user = new User(1001, "Ann", "eretertert");
        userRepository.update(user);

        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        //збереження юзера +
        //збереження того ж юзера +
        //коли немає юзера у масиві +

        user = new User(9999, "Ann", "eretertert");
        System.out.println(userRepository.update(user));
        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        //test delete()
        //if user no exists
        //if user exists
        User user2 = new User(1003, "Ann", "1w1212");
        userRepository.save(user2);
        userRepository.delete(002);
        System.out.println("delete: " + Arrays.deepToString(userRepository.getUsers()));
        userRepository.delete((long) 1001);
        System.out.println("delete: " + Arrays.deepToString(userRepository.getUsers()));

        //findById()
        //if user no exists
        //if user exists
        System.out.println("findById: " +(userRepository.findById(1001)));
        System.out.println("findById: " +(userRepository.findById(1003)));

    }
}

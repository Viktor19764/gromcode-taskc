package lesson9.HW;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        UserRepository userRepository = new UserRepository();
        User user1 = new User(1, "11", "11");
        User user2 = new User(2, "22", "22");
        User user3 = new User(33, "33", "33");
        System.out.println(Arrays.deepToString(userRepository.getUsers()));


        System.out.println("Testing save() method:");

        //save users
        for (int i = 0; i < userRepository.getUsers().length; i++)
            userRepository.save(new User(i + 1, "11", "11"));
        System.out.println("saving " + Arrays.deepToString(userRepository.getUsers()));

        //save when in middle of array is null
        userRepository.getUsers()[5] = null;
        userRepository.save(user2);
        System.out.println("saving in middle " + Arrays.deepToString(userRepository.getUsers()));

        //add null
        userRepository.save(null);
        System.out.println("adding null " + Arrays.deepToString(userRepository.getUsers()));


        //save when no places
        userRepository.save(user2);
        System.out.println("save when array is full " + Arrays.deepToString(userRepository.getUsers()));

        System.out.println("Testing update() method:");

        //update existing user
        System.out.println("update existing: hashcode of users[0] before " + userRepository.getUsers()[0].hashCode());
        userRepository.update(user1);
        System.out.println("update existing: hashcode of users[0] after  " + userRepository.getUsers()[0].hashCode());
        //update non existing user
        System.out.println("update non existing:  before  " + Arrays.deepToString(userRepository.getUsers()));
        userRepository.update(user3);
        System.out.println("update non existing:  after   " + Arrays.deepToString(userRepository.getUsers()));

        //update for null
        System.out.println("update for null:  before  " + Arrays.deepToString(userRepository.getUsers()));
        userRepository.update(null);
        System.out.println(userRepository.update(null));
        System.out.println("update for null:  after   " + Arrays.deepToString(userRepository.getUsers()));

        System.out.println("Testing findUserById() method:");

        //find existing user
        System.out.println("find existing user:  before  " + Arrays.deepToString(userRepository.getUsers()));
        System.out.println("finded  " + userRepository.findById(1));
        System.out.println("find existing user:  after   " + Arrays.deepToString(userRepository.getUsers()));

        //find non existing user
        System.out.println("find non existing user:  before  " + Arrays.deepToString(userRepository.getUsers()));
        System.out.println("no finded  " + userRepository.findById(0));
        System.out.println("find non existing user:  after   " + Arrays.deepToString(userRepository.getUsers()));

        System.out.println("Testing delete() method:");

        //delete existing user
        System.out.println("delete existing user:  before  " + Arrays.deepToString(userRepository.getUsers()));
        userRepository.delete(1);
        System.out.println("delete existing user:  after   " + Arrays.deepToString(userRepository.getUsers()));

        //delete non existing user
        System.out.println("delete non existing user:  before  " + Arrays.deepToString(userRepository.getUsers()));
        userRepository.delete(0);
        System.out.println("delete non existing user:  after   " + Arrays.deepToString(userRepository.getUsers()));



    }
}

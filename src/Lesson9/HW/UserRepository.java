package Lesson9.HW;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public String[] getUserNames() {
        int count = 0;
        for (User user : users) {
            if (user != null) {
                count++;
            }
        }
        String[] arrayOfUserNames = new String[count];
        int i = 0;
        for (User user : users) {
            if (user != null) {
                arrayOfUserNames[i] = user.getName();
                i++;
            }
        }
        return arrayOfUserNames;
    }

    public long[] getUserIds() {
        int count = 0;
        for (User user : users) {
            if (user != null) {
                count++;
            }
        }
        long[] arrayOfUserIds = new long[count];
        int i = 0;
        for (User user : users) {
            if (user != null) {
                arrayOfUserIds[i] = user.getId();
                i++;
            }
        }
        return arrayOfUserIds;
    }

    public String getUserNameById(long id) {
        for (User user : users) {
            if ((user != null) && (user.getId() == id))
                return user.getName();
        }
        return null;
    }

    //3
    public User getUserByName(String name) {
        for (User user : users) {
            if ((user != null) && (user.getName() == name))
                return user;
        }
        return null;
    }

    public User getUserById(long id) {
        for (User user : users) {
            if ((user != null) && (user.getId() == id))
                return user;
        }
        return null;
    }

    public User getUserBySessionId(String sessionId) {
        for (User user : users) {
            if ((user != null) && (user.getSessionId() == sessionId))
                return user;
        }
        return null;
    }

    //4
    public User save(User user) {
        //if user is in array, return null
        for (User userEl : users) {
            if ((userEl != null) && (userEl.getId() == user.getId()))
                return null;
        }
        //add user to array and return user
        int i = 0;
        for (User userEl : users) {
            if (userEl == null) {
                users[i] = user;
                return users[i];
            }
            i++;
        }
        //if all elements of array are busy
        int count = 0;
        for (User userEl : users) {
            if (userEl != null)
                count++;
        }
        if (count == users.length)
            return null;
        //other cases
        return null;
    }

    private User findById(long id) {
        int count = 0;
        for (User user : users) {
            if ((user != null) && (user.getId() == id))
                return users[count];
        count++;
        }
        return null;
    }

    public User update(User user) {
        int count = 0;
        for (User userEl : users) {
            if ((userEl != null) && (userEl.getId() == user.getId())) {
                users[count] = user;
                return users[count];
            }
            count++;
        }
        return null;
    }

    public void delete(long id) {
        int count = 0;
        for (User user : users) {
            if ((user != null) && (user.getId() == id))
                users[count] = null;
         count++;
        }
    }
}

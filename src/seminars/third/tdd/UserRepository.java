package seminars.third.tdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
       data.add(user);
    }

    public List generateUsers() {
        for (int i = 1; i < 11; i++ ) {
            switch (new Random().nextInt(2)) {
                case 0:
                    data.add(new Admin(getName(), "11111111", true));
                    break;
                default:
                    data.add(new User(getName(), "22222222"));
            }
        }
        return data;
    }

    private String getName() {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }


    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

}
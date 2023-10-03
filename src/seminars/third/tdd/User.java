package seminars.third.tdd;

public class User {

    String name;
    String password;
    boolean isAdmin;
    boolean isAuthenticate = false;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.isAdmin = false;

    }

    //3.6.
    public boolean authenticate(String name, String password) {
        if (this.name.equals(name) & this.password.equals(password)) {
            if (this.isAdmin == false) {
                return true;
            }
        }
        return false;
    }

}
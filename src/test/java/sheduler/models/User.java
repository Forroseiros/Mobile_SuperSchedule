package sheduler.models;

public class User {
    private  String email;
    private  String password;
    private  String login;


    public User setEmail(String email) {
        this.email = email;
        return this;
    }


    public User setLogin(String login) {
        this.login = login;
        return this;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    public String getLogin() {
        return login;
    }






    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

package entity;

public class User {
    
    private int id;
    private String who;
    private String userName;
    private String password;

    public User() {
    }

    public User(String who, String userName, String password) {
        this.who = who;
        this.userName = userName;
        this.password = password;
    }

    public String getWho() {
        return who;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWho(String who) {
        this.who = who;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "who=" + who + ", userName=" + userName + ", password=" + password + '}';
    }
  

}
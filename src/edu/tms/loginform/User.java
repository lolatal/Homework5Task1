package edu.tms.loginform;

public class User {
    private String login;
    private String password;
    public int numberOfAttempts = 3;
    private boolean statusBlocked;


    public User(String login, String password) {
        this.login=login;
        this.password=password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void resetAttempts(){
        numberOfAttempts=3;
    }
    public void reduceNumberOfAttempts () {
        this.numberOfAttempts--;
    }
    public boolean isStatusBlocked(){
        this.statusBlocked = true;
        return false;
    }

}



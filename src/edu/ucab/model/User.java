package edu.ucab.model;

public class User {
    private String user;
    private String password;
    private String name;
    private String surname;
    private int ci;

    public User() {
    }

    public User(String user, String password, int ci, String name, String surname) {
        this.user = user;
        this.password = password;
        this.ci = ci;
        this.name = name;
        this.surname = surname;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
    
    
}

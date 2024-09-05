package com.example.clase2;

public class User {

    //Atributos
    String User;
    String Pass;

    //Constructor
    public User(String user, String pass) {
        User = user;
        Pass = pass;
    }

    //Get & Set
    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }
}

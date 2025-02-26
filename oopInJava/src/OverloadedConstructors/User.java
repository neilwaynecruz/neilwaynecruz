package OverloadedConstructors;

public class User {

    String userName;
    String email;
    int age;

    User(){
        this.userName = "Guest";
        this.email = "NOT PROVIDED!";
        this.age = 0;
    }

    User(String userName){
        this.userName = userName;
        this.email = "NOT PROVIDED!";
        this.age = 2;
    }

    User(String userName, String email){
        this.userName = userName;
        this.email = email;
        this.age = 19;
    }

    User(String userName, String email, int age){
        this.userName = userName;
        this.email = email;
        this.age = age;
    }

}

package StaticKeyword;

public class Friend {

    static int numOfFriends;
    String name;
    int age;

    Friend(String name, int age){
        this.name = name;
        this.age = age;
        numOfFriends++;
    }

    static void showFriend(){
        System.out.println("You have " + numOfFriends + " total friends");
    }
}

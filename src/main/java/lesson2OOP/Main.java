package lesson2OOP;

public class Main {
    public static void main(String[] args) {
    User user = new User(69, "Vladislav", "Java developer", 28 );
    User user2 = new User(33, "Kristina", "Designer", 24 );
    user.info();
    user2.info();
    user.changePosition("Middle developer Java");
    user2.changePosition("");

    }
}

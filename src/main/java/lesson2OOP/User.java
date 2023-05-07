package lesson2OOP;

public class User {
    private int id;
    private String name;
    private String position;
    private int age;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // the constructor initializes the fields of the user class
    public User(int id, String name, String position, int age) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public void info() {
        System.out.println("Id: " + id + " Name member: " + name + " Position: " + position + " Age: " + age);
    }

    public void changePosition(String position) {
        this.position = position;
        System.out.println("Member: " + name + " got a new job: " + position);
    }
}

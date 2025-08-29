package Task3;

import java.io.Serializable;

public class Student implements Serializable {
    private static int idIndex;
    private int id;
    private String name;
    private int age;

    public Student (String name, int age) {
        this.id = idIndex;
        this.name = name;
        this.age = age;
        idIndex++;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String printInfo() {
        return "id: " + this.id + "name: " + this.name + " age: " + this.age;
    }
}

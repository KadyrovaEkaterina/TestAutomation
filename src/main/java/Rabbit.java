import javax.naming.Name;

public class Rabbit {

    String name;
    int age;
    double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    Rabbit() {
    }

    Rabbit(String name) {
        this.name = name;
    }

    Rabbit(int age) {
        this.age = age;
    }

    Rabbit(double weight) {
        this.weight = weight;

    }

    Rabbit(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    Rabbit(String name, double weight) {
        this.name = name;
        this.weight = weight;

    }

    Rabbit(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    Rabbit(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
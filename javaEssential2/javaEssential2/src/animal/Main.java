package animal;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("Marsel", 5);
        Cat c2 = new Cat("Jack", 5);
        System.out.println(c.getName() + " " + c.getAge());
        System.out.println(c2.getName() + " " + c2.getAge());
    }
}

class Person {
    public String name = "Rahul";
    private int age = 25;

    public int getAge() {
        return age;
    }
}

public class AccessDemo {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name);
        System.out.println(p.getAge());
    }
}

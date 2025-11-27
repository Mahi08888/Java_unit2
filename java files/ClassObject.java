class Student {
    String name = "Arun";
    int age = 20;
}

public class ClassObject {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name + " is " + s.age + " years old.");
    }
}

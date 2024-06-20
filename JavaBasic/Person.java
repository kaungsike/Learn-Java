package JavaBasic;

public class Person {
    public  static  void main(String[] args){
        Student aung = new Student();
        aung.name = "Aung Aung";
        aung.age = 22;

        Student aye = new Student();
        aye.name = "Aye Aye";
        aye.age = 11;

        aye.greet();
        aung.greet();

        System.out.println(aye.name + " is " + aye.age + " years old.");
    }
}


class Student {
    String name;
    int age;

    void greet() {
        System.out.println("------------------");
        System.out.println("My name is " + name);
        System.out.println("I am " + age);
        System.out.println("------------------");
    }

}
package _JavaBasic2.package2;

import _JavaBasic2.package1.Course;

public class Student {
    String name;
    Course course;

    private static int count;

    public Student(String name){
        count++;
        this.name = name;
    }

    public  void takeCourse(Course c){
        course = c;
    }

    public void sayYourCourse(){
        System.out.println("My name is "+name);
        System.out.println("I'm taking "+course.name);
    }

    public static void showStudentCount(){
        System.out.println("All Student : "+count);
    }

}

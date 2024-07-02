package SanGyiDr.P_b;

import SanGyiDr.P_a.Course;

public class Student {
    public String name;
    Course course;

    public Student(String name){
        this.name=name;
    }

    public void takeCourse(Course c){
        course = c;
    }

    public void sayYourCourse (){
        System.out.println("My Name is "+name);
        System.out.println("I'm learning "+course.name);
    }
}

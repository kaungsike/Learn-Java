package _JavaBasic2;

import _JavaBasic2.package1.*;
import _JavaBasic2.package2.*;

public class PackageTest {

    public static void main(String[] args){
//        Course c = new Course("JavaSE");

        Student st = new Student("Aung So");
        st.takeCourse(new Course("JavaSE"));
        st.sayYourCourse();
    }

}

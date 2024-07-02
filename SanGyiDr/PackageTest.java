package SanGyiDr;

import SanGyiDr.P_a.Course;
import SanGyiDr.P_b.Student;

public class PackageTest {
    public static void main(String[] args){
        Student st = new Student("Kaung Sike");
        st.takeCourse(new Course("JavaSE from JDC Myanmar"));
        st.sayYourCourse();
    }
}

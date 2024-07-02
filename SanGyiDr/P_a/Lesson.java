package SanGyiDr.P_a;

public class Lesson {
    private String name;
    private Course course;

    public Lesson(String name,Course course){
        this.name = name;
        this.course = course;
    }

    public void showInfo(){
        System.out.println("This is "+name+" course from "+course.name);
    }

    public static void main(String[] args){
        Lesson l = new Lesson("JavaSE",new Course("DJC"));
        l.showInfo();
    }
}

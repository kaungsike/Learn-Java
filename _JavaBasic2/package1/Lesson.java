package _JavaBasic2.package1;

public class Lesson {
    private String name;

    private Course course;

    public Lesson(String name,Course course){
        this.name = name;
        this.course = course;
    }

    public void showInfo(){
        System.out.println("This is "+name+" from "+course.name);
    }

//    public static void main(String[] args){
//        Course c = new Course("Yt");
//        Lesson l = new Lesson("JavaSE",c) ;
//        l.showInfo();
//    }
}

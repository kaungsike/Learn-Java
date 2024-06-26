package JavaBasic;

public class Lessons {
    private String name;
    private Course course;

    public Lessons(String name,Course course){
        this.name = name;
        this.course = course;
    }

    public  void showInfo(){
        System.out.println("This is "+ name + "Lesson from "+ course.name) ;
    }

    public static void main(String[] args){
//        Lessons l = new Lessons("Kyaw",);
//        l.showInfo();
    }
}

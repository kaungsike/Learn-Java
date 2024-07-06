package JavaBasic;

public class JavaDataType {

    public static void main(String[] args){
        int i = 10;
        Student1 st = new Student1();

        byte b = 3;
        short s = 20;
        int ii = 10;
        long l = 100;

        l = b;
        l = ii;

        ii =(int) l;
        takeValue( 2.2F);
    }

    static void takeValue(int z) {
        System.out.println("int is working");
    }
    static void takeValue(short z) {
        System.out.println("short is working");
    }
    static void takeValue(long a) {
        System.out.println("long is working");
    }
    static void takeValue(byte b) {
        System.out.println("byte is working");
    }
    static void takeValue(float f) {
        System.out.println("float is working " +f);
    }
    static void takeValue(double d) {
        System.out.println("double is working "+ d);
    }

}

class Student1 {

}

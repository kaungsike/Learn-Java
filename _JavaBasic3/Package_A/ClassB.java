package _JavaBasic3.Package_A;

public class ClassB {
    private ClassA a;

    public ClassB(){
        a = new ClassA();

        a.publicMethod();
        a.defaultMethod();
        a.protectedMethod();
//        a.privateMethod();
    }

    public static void main(String[] args){

    }
}

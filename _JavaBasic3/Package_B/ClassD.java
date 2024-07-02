package _JavaBasic3.Package_B;

import _JavaBasic3.Package_A.ClassA;

public class ClassD {
    private ClassA a;

    public ClassD(){
        a = new ClassA();

        a.publicMethod();
//        a.defaultMethod();
//        a.protectedMethod();
//        a.privateMethod();
    }

    public static void main(String[] args){

    }
}

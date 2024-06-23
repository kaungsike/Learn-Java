package JavaBasic;

public class MethodTest {
    public static void main(String[] args){
//
//        showAddResult(4,5);

        MethodTest obj = new MethodTest();
        obj.showAddResult(2,9);

        sayHello();

        int result = add(3,33);

        System.out.println(result);

        OtherMethods obj2 = new OtherMethods();
        obj2.showMessage(3,5);
    }



    void showAddResult(int a, int b){
        System.out.println(a + b);
    }

    static void sayHello(){
        System.out.println("Hello Java");
    }

    static int add(int x,int y){
        return x + y;
    }

}

package JavaBasic;

public class MethodTest {
    public static void main(String[] args){
        showAddResult(4,5);
        sayHello();

        int result = add(3,33);

        System.out.println(result);
    }



    public static void showAddResult(int a, int b){
        System.out.println(a + b);
    }

    static void sayHello(){
        System.out.println("Hello Java");
    }

    static int add(int x,int y){
        return x + y;
    }

}

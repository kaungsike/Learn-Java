package JavaBasic;

public class LocalVariableTest {

    String message = "Global Message!";

    public void showMessage(String message){
        System.out.println(message);
    }

    public void doSomething() {
        String message = "Doing Something!";

        System.out.println(this.message);
    }

    public static void main(String[] args){
        LocalVariableTest aaa = new LocalVariableTest();
        aaa.doSomething();
    }
}

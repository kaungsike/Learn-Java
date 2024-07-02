package JavaBasic;

public class CounterTest {
    public static void main(String[] args){
        Counter c1 = new Counter();
        c1.countup(9999);

        Counter c2 = new Counter();
        c2.countDown(6);

//        so default is ZERO!;


//        System.out.println("C1 count " +c1.count);

        System.out.println("C2 count " +c2.y);
    }
}

class Counter {
    static int x;
    static int y;
    public void countup(int x) {
        this.x = x;
        x++;
        System.out.println("Your counting is " +x);
    }

    public void countDown(int y){
    }
}
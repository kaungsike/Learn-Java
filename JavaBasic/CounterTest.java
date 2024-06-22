package JavaBasic;

public class CounterTest {
    public static void main(String[] args){
        Counter c1 = new Counter();
        c1.countup();

        Counter c2 = new Counter();
        c2.countup();


        System.out.println("C1 count " +c1.count);

        System.out.println("C2 count " +c2.count);
    }
}

class Counter {
    static int count;
    public void countup() {
        count ++;
    }
}
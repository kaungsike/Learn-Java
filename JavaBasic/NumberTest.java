package JavaBasic;

import java.sql.SQLType;

public class NumberTest {

    public static void main(String[] args){
        String octal = getOctalNumber(267);

        System.out.printf("Octal number of "+267 +" is "+octal +"\n");

        System.out.printf(octal + " = " + Integer.decode(octal) + "\n");

        System.out.println();

    }

    static String getOctalNumber(int data){
        StringBuilder sb = new StringBuilder();

        while (data > 0){
            sb.append(data % 8);

            data = (data / 8);
        }

        sb.reverse();

        sb.insert(0, "0");

        return sb.toString();
    }
}

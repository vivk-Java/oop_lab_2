package utm.isa;

import utm.isa.Box.Box;
import utm.isa.Queue.Queue;

import java.lang.reflect.Array;
import java.util.LinkedList;

public class Main {

    public static void println(Object object) {
        System.out.println(object.toString());
    }

    public static void main(String[] args) throws Exception {
        Box b1 = new Box();
        Box b2 = new Box(4.5f);
        Box b3 = new Box(1, 2, 3);

        println(b1);
        println(b2);
        println(b3);

        println("================================================================================");

        Queue<Integer> qInt = new Queue<Integer>();
        qInt.push(1);
        qInt.push(2);
        qInt.push(3);
        println(qInt);
        Integer i = qInt.pop();
        println(i);
        println(qInt);

        Queue<Integer> qq = new Queue<Integer>(2);
        qq.push(1);
        qq.push(2);
        qq.push(3);
        println(qq);
    }
}

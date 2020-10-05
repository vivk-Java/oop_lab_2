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

        println(b3.surface);
        println(b3.volume);

        b1.width = 3;
        b1.height = 4.5f;
        b1.width = 2.2f;

        float b1Surface = b1.surfaceCalc();
        float b1Volume = b1.volumeCalc();

        println(b1Surface);
        println(b1Volume);

        println("================================================================================");

        Queue<Integer> qUnlimited = new Queue<Integer>();
        qUnlimited.push(1);
        qUnlimited.push(2);
        qUnlimited.push(3);
        println(qUnlimited);
        Integer i = qUnlimited.pop();
        println(i);
        println(qUnlimited);

        Queue<Integer> qLimited = new Queue<Integer>(2);
        qLimited.push(1);
        qLimited.push(2);
        qLimited.push(3);
        println(qLimited);
    }
}

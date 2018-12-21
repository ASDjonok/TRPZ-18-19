package lab7;

import lab6.МузичнаКомпозиція;
import lab6.ПопулярнаКомпозиція;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MySet mySet = new MySet();
        mySet.add(new ПопулярнаКомпозиція("Yo!", 123));
        Iterator<МузичнаКомпозиція> iterator = mySet.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(mySet.contains(new ПопулярнаКомпозиція("Yo?", 123)));
        System.out.println("Done!");
    }
}

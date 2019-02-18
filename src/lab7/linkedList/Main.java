package lab7.linkedList;

import lab6.МузичнаКомпозиція;
import lab6.ПопулярнаКомпозиція;
import lab8.WrongNameValueException;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) throws WrongNameValueException {
        MyList myList = new MyList();
        myList.add(new ПопулярнаКомпозиція("Yo!", 123));
        myList.add(new ПопулярнаКомпозиція("Yo2!", 124));
        myList.add(new ПопулярнаКомпозиція("Yo3!", 125));
        Iterator<МузичнаКомпозиція> iterator = myList.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        try {
            System.out.println(iterator.next());
        } catch (NoSuchElementException e) {
            System.out.println("Ты не прав:)");
        }
    }
}

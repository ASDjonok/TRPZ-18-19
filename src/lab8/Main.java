package lab8;

import lab6.МузичнаКомпозиція;
import lab6.ПопулярнаКомпозиція;

public class Main {
    public static void main(String[] args) {
        String name = null;
        /*Exception exception;
        Object o = null;
        o.toString();*/
//        myMethod();
        //....
        /*try {
            МузичнаКомпозиція музичнаКомпозиція =
                    new МузичнаКомпозиція(name, 0);
            System.out.println(музичнаКомпозиція);
        } catch (Exception e) {
            *//*System.out.println("Извините, но нельзя создавать " +
                    "музыкальные композиции без названия!");*//*
            e.printStackTrace();
        }*/
        try {
            МузичнаКомпозиція музичнаКомпозиція =
                    new ПопулярнаКомпозиція(name, 100);
        } catch (WrongNameValueException e) {
            e.printStackTrace();
        }
        //...

        System.out.println("А я дальше работаю :p");
        /*Object o = null;
        System.out.println(o);*/
    }

    static void myMethod() {
        throw new NullPointerException();
    }
}

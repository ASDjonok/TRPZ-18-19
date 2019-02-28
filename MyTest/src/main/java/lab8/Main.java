package lab8;

import lab6.ПопулярнаКомпозиція;
import lab7.MySet;

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
            new MySet().add(new ПопулярнаКомпозиція("123", -23));
            System.out.println(":)");
        } catch (WrongNameValueException e) {
//            System.out.println("Не может быть музыка без названия):");
            System.out.println(e.getMessage());
        } catch (WrongТривалістьValueException e) {
//            System.out.println("Не может быть музыка без времени):");
            System.out.println(e.getMessage());
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

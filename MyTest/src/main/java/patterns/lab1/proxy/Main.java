package patterns.lab1.proxy;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        SystemFacade systemFacade =
                new SystemFacade();

//        String firstLineOfFile = systemFacade.getFirstLineOfFile("1.ourbmp");
        String color = systemFacade.getColor(0, 0, "1.ourbmp");
        System.out.println(color);

        /*firstLineOfFile = systemFacade.getFirstLineOfFile("2.ourbmp");
        System.out.println(firstLineOfFile);*/

        System.out.println("Done!");
    }
}

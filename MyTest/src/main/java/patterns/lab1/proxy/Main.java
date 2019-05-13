package patterns.lab1.proxy;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Client client = new Client();

//        client.doTask(new ProxySystemFacade());
        client.doTask(new RealSystemFacade());
        /*RealSystemFacade realSystemFacade =
                new RealSystemFacade();*/

//        String firstLineOfFile = realSystemFacade.getFirstLineOfFile("1.ourbmp");
        /*String color = realSystemFacade.getColor(0, 0, "1.ourbmp");
        System.out.println(color);

        color = realSystemFacade.getColor(0, 1, "1.ourbmp");
        System.out.println(color);*/

        /*firstLineOfFile = realSystemFacade.getFirstLineOfFile("2.ourbmp");
        System.out.println(firstLineOfFile);*/

        System.out.println("Done!");
    }
}

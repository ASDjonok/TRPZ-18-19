package patterns.lab1.proxy;

import java.io.FileNotFoundException;

public class Client {
    void doTask(AbstractSystemFacade abstractSystemFacade) throws FileNotFoundException {
        String color = abstractSystemFacade.getColor(0, 0, "1.ourbmp");
        System.out.println(color);

        color = abstractSystemFacade.getColor(0, 0, "1.ourbmp");
        System.out.println(color);
    }
}

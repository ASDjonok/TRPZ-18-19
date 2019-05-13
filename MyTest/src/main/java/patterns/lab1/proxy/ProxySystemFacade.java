package patterns.lab1.proxy;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class ProxySystemFacade extends AbstractSystemFacade {
    RealSystemFacade realSystemFacade = new RealSystemFacade();
    HashMap<String, String> cache = new HashMap<>();

    public String getColor(int x, int y, String fileName)
            throws FileNotFoundException {
        String result = cache.get(fileName + x + y);
        if (result == null) {
            result = realSystemFacade.getColor(x, y, fileName);
            cache.put(fileName + x + y, result);
        }
        return result;
    }
}

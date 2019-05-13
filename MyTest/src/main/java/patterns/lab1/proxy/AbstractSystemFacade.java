package patterns.lab1.proxy;

import java.io.FileNotFoundException;

public abstract class AbstractSystemFacade {
    public abstract /*static*/ String getColor(int x, int y, String fileName)
            throws FileNotFoundException;
}

import java.io.Serializable;

public class Singleton implements Cloneable, Serializable {

    private static Singleton singleton = null;

    //making constructor private so that, no one can access it outside the class
    private Singleton() {
        if (singleton != null) {
            throw new RuntimeException("You are trying to create object using reflection API and breaking singleton design pattern");
        }
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public Object readResolve() {
        return singleton;
    }

    // you are trying to clone singleton object, we are not allowing it
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return singleton;
    }
}

/* Ways to break singleton design patter and their solution
 *
 * 1. When multiple Thread try to access getInstance they might end up creating two object
 * Solution: use synchronized block
 *
 * 2. Using reflection API: we can access private constructor using it and create another object of singleton class
 * Solution: Throw exception from private constructor
 *
 * 3. Cloning Object: we can clone the object using clone method
 * Solution: override clone() method and throw exception or return same object
 *
 * 4. Deserialization :  When we serialize then de-serialize it, it creates new object which breaks singleton design pattern
 * Solution: implement readResolve() method and return same object
 */

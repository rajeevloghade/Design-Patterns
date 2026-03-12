import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println(Singleton.getInstance().hashCode());
        System.out.println(Singleton.getInstance().hashCode());


        //Serializing object
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.txt"));
        Singleton singleton = Singleton.getInstance();
        oos.writeObject(singleton);
        System.out.println(singleton.hashCode());
        System.out.println("Serialization done...");

        //DeSerializing object
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.txt"));
        Singleton object = (Singleton) ois.readObject();
        System.out.println(object.hashCode());

        // Reflection API
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton singleton2 = constructor.newInstance();
        System.out.println(singleton2.hashCode());
    }
}

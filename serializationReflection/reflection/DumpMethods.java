import java.lang.reflect.*;
public class DumpMethods {
    public static void main(String args[])
    {
        try {
            Class c = Class.forName("java.io.ObjectOutput");
            Method m[] = c.getDeclaredMethods();
            for (int i = 0; i < m.length; i++)
                System.out.println(m[i].toString());
        }
        catch (Throwable e) {
          System.out.println("Error");
            System.err.println(e);
        }
    
}

package c5.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectionTest {

    public static void main(String[] args) {
        // read class name from command line args or user input
        String name;
        if (args.length > 0) name = args[0];
        else
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name (e.g java.util.Date): ");
            name = in.next();
        }

        try {
            // print class name and superclass name (if != Object)
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print("class " + name);
            if (supercl != null && supercl != Object.class) System.out.print("extends " + supercl.getName());

            System.out.print("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printFields(cl);
            System.out.println("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Prints all fields of a class
     * @param cl
     */
    private static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();

        for(Field f : fields)
        {
            Class type = f.getType();
            String name = f.getName();
            System.out.print("    ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.println(type.getName() + " " + name + ";");
        }
    }

    /**
     * Prints all constructors of a class
     * @param cl
     */
    private static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getConstructors();

        for (Constructor c : constructors)
        {
            String name = c.getName();
            String modifiers = Modifier.toString(c.getModifiers());
            System.out.print("    ");
            if(modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print(name + "(");

            // print parameter type
            Class[] paramTypes = c.getParameterTypes();
            for (int j=0; j < paramTypes.length; j++) {
                if (j > 0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * Prints all methods of a class
     * @param cl
     */
    private static void printMethods(Class cl) {
        Method[] methods = cl.getMethods();

        for (Method m : methods)
        {
            Class retType = m.getReturnType();
            String name = m.getName();
            String modifiers = Modifier.toString(m.getModifiers());
            Class[] paramTypes = m.getParameterTypes();

            System.out.print("    ");

            if (modifiers.length() > 0)
                System.out.print(modifiers + " ");
            System.out.print(retType.getName() + " " + name + "(");

            //print paramter types
            for (int j=0;j<paramTypes.length;j++)
            {
                if (j > 0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }
}

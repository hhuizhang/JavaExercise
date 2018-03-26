package coreJava.inheritance.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * @description£º
 * @version: coreJava.inheritance 18/1/1 ÏÂÎç4:45
 * @author: catherine.zhi
 */

public class ReflectionTest {

    public static void main(String[] args) {
        String name;
        if(args.length > 0){
            name = args[0];
        }else {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name(e.g. java.util.Date): ");
            name = in.next();
        }

        try {
            Class cl = Class.forName(name);
            Class superCl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if(modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print("class " + name);
            if(superCl != null && superCl != Object.class) System.out.print(" extends " + superCl.getName());
            System.out.print("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printFields(cl);
            System.out.println();
            System.out.print("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.exit(0);
    }

    public static void printConstructors(Class cl){

        Constructor[] constructors = cl.getDeclaredConstructors();

        for(Constructor c:constructors){
            String name = c.getName();
            String modifiers = Modifier.toString(c.getModifiers());
            System.out.print("  ");
            if(modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print(name + "(");
            Class[] paraTypes = c.getParameterTypes();
            for(int i = 0;i < paraTypes.length;i++){
                if(i > 0) System.out.print(",");
                System.out.print(paraTypes[i].getName());
            }
            System.out.println(");");

        }


    }

    public static void printMethods(Class cl){

        Method[]  methods = cl.getDeclaredMethods();

        for(Method m:methods){
            Class returnType = m.getReturnType();
            String name = m.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(m.getModifiers());
            if(modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print(returnType.getName() + " " + name + "(");
            Class[] paraTypes = m.getParameterTypes();
            for(int i = 0;i < paraTypes.length;i++){
                if(i > 0) System.out.print(",");
                System.out.print(paraTypes[i].getName());
            }
            System.out.println(");");
        }


    }

    public static void printFields(Class cl){

        Field[] fields = cl.getDeclaredFields();

        for(Field f:fields){
            Class type = f.getType();
            String name = f.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(f.getModifiers());
            if(modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.println(type.getName() + " " + name + ";");
        }

    }
}

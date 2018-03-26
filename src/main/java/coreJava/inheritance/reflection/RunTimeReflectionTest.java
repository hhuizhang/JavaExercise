/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package coreJava.inheritance.reflection;

import coreJava.inheritance.Employee;

import java.lang.reflect.Field;

/**
 *
 * @author catherine
 * @version $Id: RunTimeReflectionTest.java, v 0.1 2018Äê03ÔÂ18ÈÕ 00:45 catherine Exp $
 */
public class RunTimeReflectionTest {

    /**
     *
     * @param args
     * @throws NoSuchFieldException
     * @throws IllegalAccessException
     */
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee harry = new Employee("Harry Potter",35000,1989,10,1);
        Class cl = harry.getClass();
        Field f = cl.getDeclaredField("name");
        f.setAccessible(true);
        Object v = f.get(harry);
        System.out.println(v);
        f.set(harry,"Harry Potter 2");
        System.out.println(harry);


    }
}
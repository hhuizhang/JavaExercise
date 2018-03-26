/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package coreJava.inheritance.reflection;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 三种方法将一个数组复制到另外一个新长度的数组
 * @author catherine
 * @version $Id: CopyOfTest.java, v 0.1 2018年03月18日 23:05 catherine Exp $
 */
public class CopyOfTest {

    public static void main(String[] args) {

        int[] a = {1,2,3};
        a = Arrays.copyOf(a,a.length*2);
        System.out.println("Arrays.copyOf: " + Arrays.toString(a));

        a = (int[])goodCopyOf(a,10);
        System.out.println("goodCopyOf： " + Arrays.toString(a));


        String[] b = {"ZhangSan","LiSi","WangWu"};
        b = (String[])goodCopyOf(b,10);
        System.out.println("goodCopyOf: " + Arrays.toString(b));

        //b = (String[])badCopyOf(b,10);
        //System.out.println("badCopyOf: " + Arrays.toString(b));



    }

    /**
     * 第一种，不太好的方法，返回的数组类型不是原始的数组类型，而是Object类型数组
     * @param a
     * @param newLength
     * @return
     */
    public static Object[] badCopyOf(Object[] a,int newLength){
        Object[] newArray = new Object[newLength];
        System.arraycopy(a,0,newArray,0,Math.min(a.length,newLength));
        return newArray;

    }

    /**
     * 第二种，比较好的方法，返回的数组类型和原始的类型一致,复写Arrays.copyOf方法
     * @param a
     * @param newLength
     * @return
     */
    public static Object goodCopyOf(Object a,int newLength){
        Class cl = a.getClass();
        if(!cl.isArray()) return null;
        Class componentType = cl.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType,newLength);
        System.arraycopy(a,0,newArray,0,Math.min(length,newLength));
        return newArray;
    }
}
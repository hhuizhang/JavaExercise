/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package coreJava.inheritance.reflection;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * ���ַ�����һ�����鸴�Ƶ�����һ���³��ȵ�����
 * @author catherine
 * @version $Id: CopyOfTest.java, v 0.1 2018��03��18�� 23:05 catherine Exp $
 */
public class CopyOfTest {

    public static void main(String[] args) {

        int[] a = {1,2,3};
        a = Arrays.copyOf(a,a.length*2);
        System.out.println("Arrays.copyOf: " + Arrays.toString(a));

        a = (int[])goodCopyOf(a,10);
        System.out.println("goodCopyOf�� " + Arrays.toString(a));


        String[] b = {"ZhangSan","LiSi","WangWu"};
        b = (String[])goodCopyOf(b,10);
        System.out.println("goodCopyOf: " + Arrays.toString(b));

        //b = (String[])badCopyOf(b,10);
        //System.out.println("badCopyOf: " + Arrays.toString(b));



    }

    /**
     * ��һ�֣���̫�õķ��������ص��������Ͳ���ԭʼ���������ͣ�����Object��������
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
     * �ڶ��֣��ȽϺõķ��������ص��������ͺ�ԭʼ������һ��,��дArrays.copyOf����
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
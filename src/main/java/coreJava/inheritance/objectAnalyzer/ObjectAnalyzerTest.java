/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package coreJava.inheritance.objectAnalyzer;

import java.util.ArrayList;

/**
 *
 * @author catherine
 * @version $Id: ObjectAnalyzerTest.java, v 0.1 2018Äê03ÔÂ18ÈÕ 18:25 catherine Exp $
 */
public class ObjectAnalyzerTest {

    public static void main(String[] args) {
        ArrayList<Integer> squares = new ArrayList<>();
        for(int i = 1;i <= 5; i++){
            squares.add(i*i);
        }
        System.out.println("Object toString" + squares.toString());
        System.out.println("ObjectAnalyzer toString" + new ObjectAnalyzer().toString(squares));
    }
}
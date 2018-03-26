/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package coreJava.interfaces;

import java.util.Arrays;

/**
 *
 * @author catherine
 * @version $Id: EmployeeSortTest.java, v 0.1 2018Äê03ÔÂ26ÈÕ 20:41 catherine Exp $
 */
public class EmployeeSortTest {

    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Zhang San", 12000.00);
        staff[1] = new Employee("Li Si", 18000.00);
        staff[2] = new Employee("Wang Wu", 13500.00);

        Arrays.sort(staff);

        for(Employee e:staff){
            System.out.println("Name: " + e.getName() + " Salary: " + e.getSalary());
        }

    }
}
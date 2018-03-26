/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package coreJava.interfaces;

/**
 *
 * @author catherine
 * @version $Id: Employee.java, v 0.1 2018Äê03ÔÂ26ÈÕ 20:33 catherine Exp $
 */
public class Employee implements Comparable<Employee> {

    private String name;
    private Double salary;

    public Employee(String name,Double salary){
        this.name = name;
        this.salary = salary;
    }

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method for property <tt>salary</tt>.
     *
     * @return property value of salary
     */
    public Double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary += raise;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(salary,other.salary);
    }
}
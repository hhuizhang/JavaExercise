package coreJava.inheritance;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * Created by catherine on 17/12/7.
 */
public class Employee {

    private String name;
    private double salary;
    private Date hireDate;

    public Employee(String n,double s,int year,int month, int day){
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        hireDate = calendar.getTime();

    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public Date getHireDate(){
        return hireDate;
    }

    public double raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        return salary += raise;
    }

    @Override
    public boolean equals(Object otherObject){
        if(this == otherObject){return true;}
        if(null == otherObject){return false;}
        if(getClass() != otherObject.getClass()) {return false;}
        Employee other = (Employee)otherObject;
        return name.equals(other.getName())&& hireDate.equals(other.getHireDate())&&salary==other.salary;
    }

    @Override
    public int hashCode(){
        return 7*name.hashCode()
                + 11* new Double(salary).hashCode()
                + 13* hireDate.hashCode();
    }


    @Override
    public String toString(){
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDate=" + hireDate + "]";
    }
}

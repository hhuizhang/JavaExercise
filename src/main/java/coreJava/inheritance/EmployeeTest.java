package coreJava.inheritance;

import java.util.Arrays;

/**
 * @Author: catherine.zh
 * @Date: 17/12/20 ÏÂÎç7:59
 * @Description:
 */

public class EmployeeTest {

    public static void main(String[] args) throws Exception{
        Manager boss = new Manager("Carl Cracher", 80000,1987,12,15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[4];
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker",50000,1989,10,1);
        staff[2] = new Employee("Tom Tester",40000, 1990,3,15);
        staff[3] = new Employee("Tom Tester",40000, 1990,3,15);

        for(Employee e:staff){
            System.out.println("name = " + e.getName() + ",salary = " + e.getSalary());
        }
        System.out.println(boss instanceof Employee);
        System.out.println(boss instanceof Manager);
        System.out.println(staff[1] instanceof Employee);
        System.out.println(staff[2] instanceof Manager);
        System.out.println("boss hashCode:" + boss.hashCode());
        System.out.println("staff[0] hashCode:" + staff[0].hashCode());
        System.out.println("staff[1] hashcode:" + staff[1].hashCode());
        System.out.println("staff[2] hashcode:" + staff[2].hashCode());
        System.out.println("staff[3] hashcode:" + staff[3].hashCode());

        System.out.println("staff hashcode:" + staff.hashCode());
        System.out.println("Array.staff hashcode:" + Arrays.hashCode(staff));


        String s1 = "Zhang hui";
        String s2 = "Zhang hui";
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);

        System.out.println("s1 hashCode:" + s1.hashCode());
        System.out.println("s2 hashCode:" + s1.hashCode());
        System.out.println("sb1 hashCode:" + sb1.hashCode());
        System.out.println("sb2 hashCode:" + sb2.hashCode());

        System.out.println(staff.toString());
        System.out.println(Arrays.toString(staff));
        System.out.println(boss);

        int[] luckyNumbers ={1,2,3,4,5,6};
        int[][] luckyNumbers2 = {{1,2,3,4,5},{1,2,3},{1,2,3,4,5}};
        System.out.println(luckyNumbers);
        System.out.println(Arrays.toString(luckyNumbers));
        System.out.println(Arrays.toString(luckyNumbers2));
        System.out.println(Arrays.deepToString(luckyNumbers2));
        System.out.println(boss.getClass());
        System.out.println(boss.getClass().getSuperclass());
        System.out.println(triple(5));
        System.out.println(max(13,443.313,4134.413,534));

        System.out.println(staff.getClass() + " " + staff.getClass().getName() );

        String className = "java.util.Date";
        Class cl = Class.forName(className);
        System.out.println(cl);

        Class cl1 = Employee.class;
        Class cl2 = Double[].class;
        Class cl3 = int.class;
        Class cl4 = staff[1].getClass();
        System.out.println("cl1 =" + cl1 + ",cl2 = " + cl2 + ",cl3 = " + cl3 + ",cl4 = " + cl4);

        System.out.println(cl1 == cl4);



    }

    public static int triple(int x){
        return  x = x*3;
    }

    public static double max(double... values){
        double largest = Double.MIN_VALUE;
        for(double v:values){
            if(v > largest)
                largest = v;
        }
        return largest;
    }
}

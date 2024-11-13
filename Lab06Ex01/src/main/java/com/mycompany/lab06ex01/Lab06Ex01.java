package com.mycompany.lab06ex01;

public class Lab06Ex01 {

    public static void main(String[] args) {
        Course c1=new Course("Mt12","Math","2");
        Course c2=new Course("PS101","Probability and Statistics","3");
        Faculty f1=new Faculty("Sir Hashim","Senior Lecturer","hasm@gmail.com","021-0000000",22000,345);
        Faculty f2=new Faculty("Sir Ali","Lecturer","ali@gmail.com","021-9900000",25000,305);
        Faculty f3=new Faculty("Sir Osama","Assistant Lecturer","osama@gmail.com","021-8800000",30000,225);

        Department d1=new Department("Computer Science");
        Department d2=new Department("Artificial Intelligence");
        Department d3=new Department("Cyber Security");

        f1.assignCourse(c1);
        f2.assignCourse(c1);
        f2.assignCourse(c2);
        f3.assignCourse(c2);
        d1.courseList(c1);
        d1.courseList(c2);
        d2.courseList(c1);
        d1.facultyList(f3);
        d1.facultyList(f1);
        d2.facultyList(f1);
        d3.courseList(c2);
        d3.facultyList(f3);

        System.out.println(d1.toString());
        System.out.println("\n--------------------------------------\n");
        System.out.println(d2.toString());
        System.out.println("\n--------------------------------------\n");
        System.out.println(d3.toString());
        System.out.println("\n--------------------------------------\n");

      
    }
}



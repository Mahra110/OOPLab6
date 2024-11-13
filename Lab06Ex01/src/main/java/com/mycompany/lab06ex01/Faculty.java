package com.mycompany.lab06ex01;
import java.util.ArrayList;
public class Faculty {
    private String facultyName,facultyDesignation,facultyEmail,facultyContact;
    private int facultySalary,facultyID;
    private ArrayList<Course> courseList;
    public Faculty()
    {
facultyName=null;
facultyDesignation=null;
facultyEmail=null;
facultyContact=null;
    facultySalary=0;
    facultyID=0;        
    }
    public Faculty(String facultyName,String facultyDesignation,String facultyEmail,String facultyContact,int facultySalary,int facultyID)
    {
        this.facultyName=facultyName;
        this.facultyDesignation=facultyDesignation;
        this.facultyEmail=facultyEmail;
        this.facultyContact=facultyContact;
        this.facultySalary=facultySalary;
        this.facultyID=facultyID;
        courseList=new ArrayList<Course>();
    }
    public void assignCourse(Course course)
    {
        courseList.add(course);
    }
    @Override
    public String toString()
    {
        String courses="";
        for (Course course:courseList)
        {
            courses+=course.toString()+"\n";
        }
        return "Faculty Name: "+facultyName+"\nFaculty Designation: "+facultyDesignation+"\nFaculty Contact: "+facultyContact+"\nFaculty Salary: "+facultySalary+"\nFaculty ID: "+facultyID+"\nCourses taught by "+facultyName+" :\n"+courses;
    }
}

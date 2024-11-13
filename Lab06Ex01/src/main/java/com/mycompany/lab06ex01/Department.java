package com.mycompany.lab06ex01;
import java.util.ArrayList;

public class Department {
    String departmentName;
    ArrayList<Course> offeredCourse;
    ArrayList<Faculty> departmentFaculty;
    public Department()
    {
        departmentName=null;
    }
    public Department(String departmentName)
    {
        this.departmentName=departmentName;
        offeredCourse=new ArrayList<Course>();
        departmentFaculty=new ArrayList<Faculty>();
    }
    public void facultyList(Faculty faculty)
    {
        departmentFaculty.add(faculty);
    }
    public void courseList(Course course)
    {
        offeredCourse.add(course);
    }
    @Override
    public String toString()
    {
        String courses="";
        for (Course course:offeredCourse)
        {
            courses+=course.toString()+"\n";
        }
        String faculties="";
        for (Faculty faculty:departmentFaculty)
        {
            faculties+=faculty.toString()+"\n";
        }
      
    return "Department Name: "+departmentName+"\n\n-Department Faculty-\n"+faculties+"-Course(s) offered-: "+courses;
    }
}

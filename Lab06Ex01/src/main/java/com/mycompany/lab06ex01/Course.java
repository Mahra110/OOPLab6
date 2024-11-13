package com.mycompany.lab06ex01;
public class Course {
   private String courseCode,courseName,courseCreditHours;
   public Course()
   {
    courseCode=null;
    courseName=null;
    courseCreditHours=null;  
   }
    public Course(String courseCode,String courseName, String courseCreditHours)
    {
        this.courseCode=courseCode;
        this.courseName=courseName;
        this.courseCreditHours=courseCreditHours;

    }
    public String getCourseCode()
    {
        return courseCode;
    }
    public String getCourseName()
    {
        return courseName;
    }
    public String getCourseCreditHours()
    {
        return courseCreditHours;
    }
    @Override
    public String toString()
    {        return "Course Code: " + courseCode + "\nCourse Name: " + courseName + "\nCourse Credit Hours: " + courseCreditHours+"\n";

    }
}


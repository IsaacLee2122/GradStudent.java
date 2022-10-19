Student.java

import java.util.ArrayList;

public class Student {
//Instance variables
private String name;
private int year;
private ArrayList<String> courses;

//Constructor
public Student(String name, int year) {
super();
courses=new ArrayList<String>();
this.name = name;
this.year = year;
}
//Adds a course
public void addCourse(String name)
{
courses.add(name);
}
//Clears all courses
public void dropAll()
{
courses.clear();
}
//REturns course count
public int getCourseCount()
{
return courses.size();
}

public String getName() {
return name;
}

public int getYear() {
return year;
}

public double getTuition()
{
return 1450*courses.size();
}
//Returns course list
public ArrayList<String> getCourses() {
return courses;
}



}
GradStudent.java

public class GradStudent extends Student{

//Instance variables
private String advisor;
//Constructor
public GradStudent(String name, int year, String advisor) {
super(name, year);
this.advisor=advisor;
}
public String getAdvisor() {
return advisor;
}
//Returns if a student is burnt out
public boolean isBurntOut()
{
if(super.getCourseCount()>=5 || this.getYear()>=8)
return true;

return false;
}
//Adds a course
@Override
public void addCourse(String name)
{
if(super.getCourseCount()<6)
super.getCourses().add(name);
else
System.out.println("Cannot add course! Maximum allowed courses exceeded! ");
}

@Override
public double getTuition()
{
double tuitionFee=0;
if(super.getCourseCount()<=1)
tuitionFee=1000;
else
tuitionFee=2*super.getTuition();

return tuitionFee;
}
}

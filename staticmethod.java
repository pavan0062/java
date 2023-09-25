//java program to demonstrate the usage of static method
//25.09.23
//StaticMethodDemo.java
import java.io.*;
class Student
{
int Rollno;
String Name;
static String college="SITE";
Student(int r,String n)
{
    Rollno=r;
    Name=n;
}
void display()
{
    System.out.println(Rollno+" "+Name+" "+college);
}
}
public class staticMethodDemo
{
    public static void main(String args[])
    {
    Student s1=new Student(4263,"pavan");
    Student s2=new Student(4223,"syam");
    System.out.println("Student details are : ");
    s1.display();
    s2.display();
    }
}

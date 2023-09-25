//Java programme to demonstrae Static method (or) to find the cube of the given number
//15-09-2023
//StaticMethodDemo2.java
import java.io.*;
public class Calculate
{
    static int cube(int x)
    {
        return x*x*x;
    }
    public static void main(String args[])
    {
        int result=Calculate.cube(64);
        System.out.println("cube of 64 is : "+result);
    }
}

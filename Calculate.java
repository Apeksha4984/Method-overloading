

package com.mycompany.methodoverloading;

public class Calculate {
    public static double getAdd()
    {
       int a=2,b=3;
       return a+b;
    }
    public static double getAdd(double a,double b)
    {
        return a+b;
    }
    
    public static double getAdd(double a,double b,double c)
    {
        return a+b+c;
    }
    public static double getAdd(double a,double b ,int c)
    {
        return a+b+c;
    }
    public static double getAdd(double a,int b,double c)
    {
        return a+b+c;
    }
    
    
}

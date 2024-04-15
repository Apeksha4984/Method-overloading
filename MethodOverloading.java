


package com.mycompany.methodoverloading;



public class MethodOverloading {
    public void errormessage()
    {
        System.out.println("error message");
        
    }
       public void errormessage(int a)
    {
        System.out.println(a);
        
    }
            
       public void errormessage(int a ,int b)
    {
        System.out.println(a+b);
        
    }
            public void errormessage(int a ,String b)
    {
        System.out.println(a+" " +b);
        
    }
            public void errormessage(String b ,int a)
    {
        System.out.println(a+ " " +b);
        
    }
            

    public static void main(String[] args) {
        Calculate.getAdd();
        MethodOverloading o = new MethodOverloading();
        o.errormessage();
        o.errormessage(1);
        o.errormessage("a", 2);
        o.errormessage(4, "f");
        o.errormessage(2, 3);
    }
    
         
        
    
}

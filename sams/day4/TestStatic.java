package com.sams.day4;

 

 class StaticDemo 
{
 static int a = 13; // static variable
 static int b = 1199; // static variable
 static void callme() // static method
{
System.out.println("The value of a = " + a);
}
}
 
public class TestStatic
  {
 public static void main(String args[]) 
{
 //Static method is being called using the name of the class
StaticDemo.callme();
 //Static variable is accessed with the class name
System.out.println("The value of b = " + StaticDemo.b);
}
}

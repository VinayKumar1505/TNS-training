package com.sams.day4;

 class TestInstance 
{
int b = 119;//instance variable

void callme() //instance method
{
System.out.println("The value of b = " + b);
}
}

 

public class Instance{

 public static void main(String args[]) 
{
 
TestInstance id = new TestInstance();
 //Instance method is being called using the object of the class
id.callme();

}
}
package com.tnsprogram;

public class First {
	static int test= 58;
   public static void main(String[] args) {
	   second obj= new second();
	   
	   System.out.println(test);
	  
	  int a= obj.id= 701;
	  float cgpa= obj.id1= (float) 6.8;
	   obj.name= "vinay";
	  String add= obj.address= "hyderabad";
	   
	   System.out.println(a);
	   System.out.println("his name is:"+obj.name);
	   System.out.println("he is from "+ add);
	   System.out.println("the percentage he got is :"+ cgpa);
	   
   }
}

class second{
	int id;
	float id1;
	String name;
	String address;
	
}

package com.sams.day4;

 
 class ArithmeticUtilityClass {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}


class Main{



public static void main(String args[]) {


int a = ArithmeticUtilityClass.add(3, 6);
// result is 9

int b = ArithmeticUtilityClass.subtract(8, 2);
// result is 6

int c = ArithmeticUtilityClass.multiply(5, 8);
// result is 40

int d = ArithmeticUtilityClass.divide(20, 4);
// result is 5

System.out.println(a);
System.out.println("the value of a is "+ a+ ", the value of b is "+ b+ ", the value of c is "+ c+ ", the value of d is "+ d);


}
}
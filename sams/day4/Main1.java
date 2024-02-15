package com.sams.day4;

 

class Main1 {
   static void hello() {
        System.out.print("This is the non static method");
    }

    static void print() {
        // Calling the non-static method from the static method
        // This will cause an error
        hello();
    }

    public static void main(String[] args) {
        // Accessing the static method of the class.
        Main1.print();

    }
}


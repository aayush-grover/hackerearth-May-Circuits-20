// Factorial equations
// Max. Marks: 100

// You are given two numbers
// and . Your task is to find the last digit of the following equation: 

// Input format

// The first line contains two integers
// and

// .

// Output format

// Print the last digit of the given equation.

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes*/
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner sc = new Scanner(System.in);
        long x=sc.nextLong();
        long n=sc.nextLong();
        x=x%10;
        double factorial=0;
        int res=0;
        if(n==2) factorial=2;
        else if(n==3) factorial=6;
        else if(n==4) factorial=4;
        else if(n==0) factorial=1;
          res =(int) Math.pow(x,factorial);
        System.out.println(res%10);
    }
}

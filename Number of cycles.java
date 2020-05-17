// Number of cycles
// Max. Marks: 100

// You are given an N-sided regular polygon. You have connected the center of the polygon with all the vertices, thus dividing the polygon into N equal parts.

// Your task is to find the count of simple cycles that exist in the modified structure of the polygon.

// Input format

//     The first line contains an integer 

// denoting the number of queries.
// The second line contains an integer

//     denoting the number of sides in the regular polygon.

// Output format

// Print the count of simple cycles corresponding to each query in a separate line.

import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q>0)
        {
            long n=sc.nextInt();
            System.out.println((n-1)*n + 1);
            q--;
        }
    }
}

/*Odd numbers
Problem Description

Print first 5 odd numbers i.e. 1, 3, 5, 7, 9 using concatenation operator ( + )


Output Format
Print first five odd numbers separated by space.


Example Output
1 3 5 7 9


User Code */
import java.lang.*;
import java.util.*;

public class Attempt_4_Contest_Q2 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        for(int i=1;i<10;i=i+2)
        {
            System.out.print(i);
            if(i!=9)
                System.out.print(" ");
        }
       // System.out.print(1+" "+2+" "+3+" "+4+" "+5);
    }
} 
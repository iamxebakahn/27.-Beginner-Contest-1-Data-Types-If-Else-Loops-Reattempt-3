/*Situation Of Number
Problem Description

Check whether a given number is positive-odd, positive-even, negative-odd OR negative-even.
Write a code to figure out the Situation.
Take a number N from user and print the Situation Of Number.
if positive-odd : print -> "Number is Positive and Odd"
if positive-even : print -> "Number is Positive and Even"
if negative-odd : print -> "Number is Negative and Odd"
if negative-even : print -> "Number is Negative and Even"


Problem Constraints
-1000000 <= N <= 1000000


Input Format
Take a number N from user.


Output Format
Print the Situation Of Number according to condition.


Example Input
Input 1 :
198

Input 2 :
-167


Example Output
Output 1 :
Number is Positive and Even

Output 2 :
Number is Negative and Odd


Example Explanation
Explanation 1 :
198 is greater than 0 so it is a positive number and 198 % 2 == 0 so it is an even number.

Explanation 2 :
-167 is smaller than 0 so it is a negative number and -167 % 2 != 0 so it is an odd number.


User Code */
 import java.lang.*;
import java.util.*;

public class Attempt_4_Contest_Q3 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N>0)
        {
            if(N%2==0)
                System.out.print("Number is Positive and Even");
            else
                System.out.print("Number is Positive and Odd");
        }
        else if(N<0)
        {
            if(N%2==0)
                System.out.print("Number is Negative and Even");
            else
                System.out.print("Number is Negative and Odd");
        }
    }
} 
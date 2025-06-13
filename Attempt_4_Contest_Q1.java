/*Odd Game
Problem Description

Write a program to print all odd numbers from 1 to N where you have to take N as input from user. Here N is inclusive.

Note:
Each number should be followed by a space, including the last number.


Problem Constraints
1 <= N <= 2000000



Input Format
A single line representing N



Output Format
 All odd numbers from 1 to N, each number followed by a space, including the last number.



Example Input
Input 1:

5
Input 2:

10


Example Output
Output 1:

1 3 5 
Output 2:

1 3 5 7 9 


User Code */
 import java.lang.*;
import java.util.*;

public class Attempt_4_Contest_Q1 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N%2==0)
            N=N-1;
        for(int i=1;i<=N;i=i+2)
            System.out.print(i+" ");
    }
} 
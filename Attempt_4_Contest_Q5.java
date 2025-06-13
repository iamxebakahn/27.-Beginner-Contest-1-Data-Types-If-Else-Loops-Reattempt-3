/*Legal height for new building
Problem Description

Rahul just bought a land for house construction. Now he has to take permission from the Government office.

Since there are land zones based on which height of a building is decided.

If a land falls between zone 1 to 5 then maximum height possible is 30 meters.

If a land falls between zone 6 to 10 then maximum height possible is 25 meters.

If a land falls between zone 11 to 15 then maximum height possible is 20 meters.

If a land falls between zone 16 to 20 then maximum height possible is 10 meters.

For any zones other than that construction is prohibited.

Problem Constraints

0 <= zone <= 100000</div>

Input Format

In first line take zone as integer input.</div>

Output Format

Output is going to be single line answer based upon the land zone.

If land falls in any valid zone then print “Maximum height possible for building is height meters”.

Print “Here construction is prohibited” if not eligible.

Example Input

Input 1 :

7


Input 2 :

25

Example Output

Output 1 :

Maximum height possible for building is 25 meters


Output 2 :

Here construction is prohibited

Example Explanation

Explanation 1 :

Since land zone is 7 so maximum height is 25 meters


Explanation 2 :

Here construction is prohibited

User Code */
import java.lang.*;
import java.util.*;

public class Attempt_4_Contest_Q5 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int zone=sc.nextInt();
        int height=0;
        if(zone>=1 && zone<=5)
            height=30;
        else if(zone>=6 && zone<=10)
            height=25;
        else if(zone>=11  && zone<=15)
            height=20;
        else if(zone>=16 && zone<=20)
            height=10;
        else
            height=0;
            
        if(height==0)
            System.out.print("Here construction is prohibited");
        else
            System.out.print("Maximum height possible for building is "+height+" meters");
    }
} 
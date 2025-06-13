/*Area Of Rectangle
Problem Description

Given Value of Length (L) and Breadth (B) of a Rectangle. Calculate Area Of Rectangle and Print the Result.

Note :
Formula for Area of rectangle is Area : Length * Breadth



Problem Constraints

0 <= L, B <= 10000
2. L and B are Integer Number.</div>


Input Format

The first line of the input is L denoting the Length
The second line of the input is B denoting the Breadth.</div>



Output Format

Print result in a single line denoting the Area of rectangle.</div>



Example Input

Input 1 :
15
65

Input 2 :
45
26</div>



Example Output

Output 1 :
975

Output 2 :
1170</div>



Example Explanation

Example Exaplanation 1 :
Length of 15 and breadth is 65, Area is 15 * 65 = 975

Example Exaplanation 2 :
Length of 45 and breadth is 26, Area is 45 * 26 = 1170</div>




User Code */
 import java.lang.*;
import java.util.*;

public class Attempt_4_Contest_Q4 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();
        int B=sc.nextInt();
        System.out.print(L*B);
        
    }
} 
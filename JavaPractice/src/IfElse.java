/*
Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of 2 to 5, print Not Weird
If  is even and in the inclusive range of 6 to 20, print Weird
If  is even and greater than 20 , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, .

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.
 */
import java.util.*;
import java.util.stream.IntStream;
public class IfElse {
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int n = input.nextInt();
        IntStream r1 = IntStream.range(2,6);
        IntStream r2 = IntStream.range(6,21);

        if (n%2!=0){
            System.out.println("Weird");
        } else if (r1.anyMatch(x->x==n)){
            System.out.println("Not Weird");
        } else if (r2.anyMatch(x->x==n)){
            System.out.println("Weird");
        } else{
            System.out.println("Not Weird");
        }
    }
}

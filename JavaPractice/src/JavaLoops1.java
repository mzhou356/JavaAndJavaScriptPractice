/*
HackerRank Java Practice
Objective
In this challenge, we're going to use loops to help us do some simple math.

Task
Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.

Input Format

A single integer, .

Constraints

Output Format

Print  lines of output; each line  (where ) contains the  of  in the form:
N x i = result.
 */
import java.util.*;
public class JavaLoops1 {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int N = scanner.nextInt();
        for (int i = 1; i <=10; i++){
            System.out.println(N + " x "+ i + " = "+i*N);
        }

    }

}

/*
We use the integers , , and  to create the following series:

You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.

Input Format

The first line contains an integer, , denoting the number of queries.
Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.

Constraints

Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.

Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
 */

import java.util.*;
public class JavaLoopII {
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int N = input.nextInt();
        for (int i =0; i<N;i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            System.out.println(entireSeries(a,b,n));
        }

    }

    public static String series(int a,int b,int j){
        int ans = a;
        for (int i=0;i<=j;i++){
            ans += ((int) (Math.pow(2.0,i)))*b;
        }
        return String.valueOf(ans);
    }

    public static String entireSeries(int a,int b, int n){
        List<String> series = new ArrayList<String>();
        for (int i=0; i<n;i++){
            series.add(series(a,b,i));
        }
        String joined = String.join(" ",series);
        return joined;
    }

}

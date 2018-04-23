/*
Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros. Print the decimal value of each fraction on a new line.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

Input Format

The first line contains an integer, , denoting the size of the array. 
The second line contains  space-separated integers describing an array of numbers .

Output Format

You must print the following  lines:

A decimal representing of the fraction of positive numbers in the array compared to its size.
A decimal representing of the fraction of negative numbers in the array compared to its size.
A decimal representing of the fraction of zeros in the array compared to its size.
Sample Input

6
-4 3 -9 0 4 1         
Sample Output

0.500000
0.333333
0.166667

*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int[] arr= new int[total];
        int pos=0, zero=0, neg=0;
        while(sc.hasNextLine()){
          for(int i=0;i<total;i++){
            arr[i]=sc.nextInt();
            if (arr[i]==0) zero++;
            else if (arr[i]>0) pos++;
            else neg++;
            }
        }
        //System.out.println(pos + " " + neg + " " + zero);
        double positive=0.0, negative=0.0, z=0.0;
        positive =  ((double)pos/total);
        
        negative= ((double)neg/total);
        z = ((double)zero/total);
        System.out.printf("%6f\n",positive);
        System.out.printf("%6f\n",negative);
        System.out.printf("%6f\n",z);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

/*
Calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.

Function Description

Complete the function aVeryBigSum described below to return the sum of all elements of the array.

aVeryBigSum(integer: n, integer: arr_size, integer array: arr)
Parameters:
n: array size
arr_size: array size
ar: array of integers to sum
Returns: integer sum of all array elements
Constraints
1<=n<=10
0<=ar[i]<=10^10
Raw Input Format

The first line of the input consists of an integer n. 
The next line contains  space-separated integers contained in the array.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        long sum = 0;
        long[] arr = new long[total];
        while (sc.hasNextLine()){
            for (int i=0; i<total;i++){
                arr[i]=sc.nextLong();
                sum = sum + arr[i];
            }
            System.out.println(sum);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

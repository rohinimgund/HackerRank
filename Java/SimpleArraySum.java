/*
Given an array of integers, find the sum of its elements.

Function Description

Complete the simpleArraySum function described below to return the sum of all elements of the array.

simpleArraySum(integer: n, integer array: arr)
Parameters:
n: array size
ar: array of integers to sum
Returns: integer sum of all array elements
Raw Input Format

The first line contains an integer, , denoting the size of the array. 
The second line contains  space-separated integers representing the array's elements.
*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int sum =0;
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int[] arr=new int[total];
        while (sc.hasNextLine()){
            for (int i=0; i<total; i++)
            {
                arr[i]= sc.nextInt();
                sum = sum + arr[i];
            }
            System.out.println(sum);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
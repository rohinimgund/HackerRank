/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.

Function Description

Complete the diagonalDifference function described below to calculate the absolute difference between diagonal sums.

diagonalDifference( integer: a_size_rows, integer: a_size_cols, integer array: arr)
Parameters:
a_size_rows: number of rows in array
a_size_cols: number of columns in array
a: array of integers to process
Returns: integer value that was calculated
Constraints

Raw Input Format

The first line contains a single integer,  denoting the number of rows and columns in the matrix . 
The next  lines denote the matrix 's rows, with each line containing  space-separated integers describing the columns.

Sample Input 0

3
11 2 4
4 5 6
10 8 -12
Sample Output 0

15
Explanation 0

The primary diagonal is:

11
   5
     -12
Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:

     4
   5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19 
Difference: |4 - 19| = 15
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int diff = 0, sum1=0, sum2=0;
        int[][] arr1= new int[total][total];
        while(sc.hasNextLine()){
            
        for(int i=0; i<total;i++){
            for (int j=0; j<total;j++){
                arr1[i][j] = sc.nextInt();
                if (i==j){
                    sum1 = sum1 + arr1[i][j];
                }
            }
        }
        int k = total-1;
        for(int i=0; i<total & k>=0;i++){
            
               sum2 = sum2 + arr1[i][k]; 
                k--;            
            }
        }
    
    diff = Math.abs(sum1 - sum2);
    System.out.println(diff);
    
        
        
            
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
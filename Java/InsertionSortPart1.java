/*
Sorting 
One common task for computers is to sort data. For example, people might want to see all their files on a computer sorted by size. Since sorting is a simple problem with many different possible solutions, it is often used to introduce the study of algorithms.

Insertion Sort 
These challenges will cover Insertion Sort, a simple and intuitive sorting algorithm. We will first start with a nearly sorted list.

Insert element into sorted list 
Given a sorted list with an unsorted number  in the rightmost cell, can you write some simple code to insert  into the array so that it remains sorted?

Since this is a learning exercise, it won't be the most efficient way of performing the insertion. It will instead demonstrate the brute-force method in detail.

Assume you are given the array  indexed . Store the value of . Now test lower index values successively from  to  until you reach a value that is lower than ,  in this case. Each time your test fails, copy the value at the lower index to the current index and print your array. When the next lower indexed value is smaller than , insert the stored value at the current index and print the entire array.

The results of operations on the example array is:

Starting array:  
Store the value of  Do the tests and print interim results:

1 2 4 5 5
1 2 4 4 5
1 2 3 4 5
Input Format

There will be two lines of input:

The first line contains the integer , the size of the array 
The next line contains  space-separated integers 

Constraints

 

Output Format

Print the array as a row of space-separated integers each time there is a shift or insertion.

Sample Input

5
2 4 6 8 3
Sample Output

2 4 6 8 8 
2 4 6 6 8 
2 4 4 6 8 
2 3 4 6 8 

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    

    public static void insertIntoSorted(int[] ar) {
        int k = ar[ar.length-1];
        //System.out.println(k);
		int j=ar.length-2;
        //System.out.println(j);
		while (j>=0 && ar[j] > k ){
					ar[j+1] = ar[j];
					j=j-1;
                    printArray(ar);
				}
                        
				ar[j+1]=k;
		/*		
        int j = ar.length-1;
        int value = ar[j];
        while (j>=0 && ar[j]<value){
            if(ar[j]<ar[j-1]){
                value=ar[j];
                ar[j]=ar[j-1];            
            }
            j--;
            printArray(ar);
            ar[j]=value;
        } */
        printArray(ar);
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}

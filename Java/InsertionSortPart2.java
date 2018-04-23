/*
In Insertion Sort Part 1, you inserted one element into an array at its correct sorted position. Using the same approach repeatedly, can you sort an entire array?

Guideline: You already can place an element into a sorted array. How can you use that code to build up a sorted array, one element at a time? Note that in the first step, when you consider an array with just the first element, it is already sorted since there's nothing to compare it to.

In this challenge, print the array after each iteration of the insertion sort, i.e., whenever the next element has been inserted at its correct position. Since the array composed of just the first element is already sorted, begin printing after placing the second element.

Complete the insertionSort2 function below using the insertion sort algorithm to sort an array of integers. As each element is placed in its final position of an iteration, print the array as a string of space-separated integers on its own line.

Input Format

There will be two lines of input:

 - the size of the array
 space-separated integers that make up 
Constraints

 

Output Format

On each line, output the entire array at every iteration.

Sample Input

6
1 4 3 5 6 2
Sample Output

1 4 3 5 6 2 
1 3 4 5 6 2 
1 3 4 5 6 2 
1 3 4 5 6 2 
1 2 3 4 5 6 

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSortPart2(int[] ar)
    {       
         for (int i=0;i<ar.length;i++){
             int k = ar[i];
             int j = i-1;
             while (j>=0 && ar[j]>k){
                 ar[j+1]=ar[j];
                 j--;
                 
             }
             ar[j+1]=k;
             if(i>0){
                 printArray(ar);
             }
             
         }
         
           // Fill up the code for the required logic here
           // Manipulate the array as required
           // The code for Input/Output is already provided
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}

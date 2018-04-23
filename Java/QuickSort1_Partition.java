/*
The previous challenges covered Insertion Sort, which is a simple and intuitive sorting algorithm with a running time of . In these next few challenges, we're covering a divide-and-conquer algorithm called Quicksort (also known as Partition Sort). This challenge is a modified version of the algorithm that only addresses partitioning. It is implemented as follows:

Step 1: Divide 
Choose some pivot element, , and partition your unsorted array, , into three smaller arrays: , , and , where each element in , each element in , and each element in .

For example: Assume  
The pivot is at  
 is divided into , , and . 
Putting them all together, you get . Another valid solution is .

Given  and , partition  into , , and  using the Divide instructions above. Then print each element in  followed by each element in , followed by each element in  on a single line. Your output should be space-separated and does not have to maintain ordering of the elements within the three categories.

Input Format

The first line contains , the size of the array . 
The second line contains  space-separated integers describing  (the unsorted array). The first integer (corresponding to ) is your pivot element, .

Constraints

All elements will be unique.
Output Format

On a single line, print the partitioned numbers (i.e.: the elements in , then the elements in , and then the elements in ). Each integer should be separated by a single space.

Sample Input

5
4 5 3 7 2
Sample Output

3 2 4 5 7

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] a= new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int b[]=new int[size];
        int pivot=a[0];
        int j=1;
        int k=0;
        while(j<size){
            if(a[j]<pivot){
                b[k]=a[j];
                k++;
               }
            j++;
        }
        b[k]=pivot;
        k++;
        for(int p=0;p<size;p++){
            if(a[p]>pivot){
                b[k]=a[p];
                k++;
            }
        }
        printArray(b);
        //System.out.println(left);
        //System.out.println(right);
        //System.out.println(pivot);
        //printArray(a);
        
        //printArray(left);
    }
    
    public static void printArray(int[] array){
        for(int n:array){
            System.out.print(n+" ");
        }
        System.out.println();
    }
}
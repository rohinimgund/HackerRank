/*
Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from  to  for three categories: problem clarity, originality, and difficulty.

We define the rating for Alice's challenge to be the triplet , and the rating for Bob's challenge to be the triplet .

Your task is to find their comparison points by comparing  with ,  with , and  with .

If a[i]>b[i], then Alice is awarded  point.
If a[i]<b[i], then Bob is awarded  point.
If a[i]=b[i], then neither person receives a point.
Comparison points is the total points a person earned.

Given A and B, can you compare the two challenges and print their respective comparison points?

Input Format

The first line contains 3 space-separated integers, , , and , describing the respective values in triplet . 
The second line contains 3 space-separated integers, , , and , describing the respective values in triplet .

Constraints

Output Format

Print two space-separated integers denoting the respective comparison points earned by Alice and Bob.

*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int count1=0, count2 = 0;
        if (a0 > b0){
            count1++;
            if ( a1 > b1)count1 ++; else if( b1 > a1)count2++;
            if ( a2 > b2)count1 ++; else if(b2 > a2)count2++;
                }
        else if (b0 > a0){
            count2++;
            if ( a1 > b1)count1 ++; else if( b1 > a1)count2++;
            if ( a2 > b2)count1 ++; else if(b2 > a2)count2++;
        }
        else {
            if ( a1 > b1)count1 ++; else if( b1 > a1)count2++;
            if ( a2 > b2)count1 ++; else if(b2 > a2)count2++;
        }
        System.out.print(count1+" "+count2);       
    }
}
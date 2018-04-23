/*
Steve has a string, , consisting of  lowercase English alphabetic letters. In one operation, he can delete any pair of adjacent letters with same value. For example, string "aabcc" would become either "aab" or "bcc" after  operation.

Steve wants to reduce  as much as possible. To do this, he will repeat the above operation as many times as it can be performed. Help Steve out by finding and printing 's non-reducible form!

Note: If the final string is empty, print Empty String .

Input Format

A single string, .

Constraints

Output Format

If the final string is empty, print Empty String; otherwise, print the final non-reducible string.

Sample Input 0

aaabccddd
Sample Output 0

abd
Explanation 0

Steve can perform the following sequence of operations to get the final string:

aaabccddd → abccddd
abccddd → abddd
abddd → abd
Thus, we print abd.

Sample Input 1

baab
Sample Output 1

Empty String
Explanation 1

Steve can perform the following sequence of operations to get the final string:

baab → bb
bb → Empty String
Thus, we print Empty String.
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s= new StringBuilder(sc.next());
        boolean IsString = true;
        while(IsString){
        IsString= false;    
        for(int i=0; i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                s.delete(i,i+2);
                IsString=true;
            }
               
        }
        }    
        if (s.length() == 0) {
            System.out.println("Empty String");
        } 
        else {
            System.out.println(s.toString());
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
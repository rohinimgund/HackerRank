/*
Julius Caesar protected his confidential information by encrypting it using a cipher. Caesar's cipher shifts each letter by a number of letters. If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet. In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.

Original alphabet:      abcdefghijklmnopqrstuvwxyz
Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc
Note: The cipher only encrypts letters; symbols, such as -, remain unencrypted.

Input Format

The first line contains the integer, , the length of the unencrypted string. 
The second line contains the unencrypted string, . 
The third line contains , the number of letters to rotate the alphabet by.

Constraints

 
 
 is a valid ASCII string without any spaces.

Output Format

For each test case, print the encoded string.

Sample Input

11
middle-Outz
2
Sample Output

okffng-Qwvb
Explanation

Original alphabet:      abcdefghijklmnopqrstuvwxyz
Alphabet rotated +2:    cdefghijklmnopqrstuvwxyzab

m -> o
i -> k
d -> f
d -> f
l -> n
e -> g
-    -
O -> Q
u -> w
t -> v
z -> b
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        String s=sc.next();
        StringBuilder res= new StringBuilder();
        int[] ascii = new int[len];
        int num=sc.nextInt();
        //String condition = "((?=.*(a-z))(?=.*(A-Z))";
        for(int i=0;i<len;i++){
           if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90){
               int temp = (int)s.charAt(i)+num;
              if(temp>90){
                do{
                ascii[i]= (64+(temp-90));
                temp= ascii[i];    
                }while(ascii[i]>90);
            }
            else{   
               ascii[i]= (int)(s.charAt(i))+num;
            } 
            res.append((char)(ascii[i]));   
           }
           else if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122) {
            int temp= (int)s.charAt(i)+num;
            if(temp>122){
               do{
                ascii[i]= (96+(temp-122));
                temp=ascii[i];   
               }while(ascii[i]>122);   
            }
            else{   
               ascii[i]= (int)(s.charAt(i))+num;
            }   
            res.append((char)(ascii[i])); 
           }
           else{
             res.append(s.charAt(i));  
           }
            
        }
        
        System.out.println(res.toString());
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
/*
Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

Function Description

Complete the timeConversion function described below to return the converted timestring.

timeConversion(string: s)
Parameters:
s: time string to convert
Returns: string representing time in 24 hour format
Raw Input Format

A single string  containing a time in -hour clock format (i.e.:  or ), where  and .

Sample Input 0

07:05:45PM
Sample Output 0

19:05:45

*/
import java.io.*;
import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String[] str = sc.nextLine().split(":");
        //SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ssaa");
        //SimpleDateFormat outputFormat = new SimpleDateFormat("hh:mm:ss");
        //Date date=null;
        //date = inputFormat.parse(str[]);
        //String mytime = outputFormat.format(date);
        
        
        String hours = str[0];
        
        String minutes = str[1];
        String seconds = str[2].substring(0,2);
       
        String dayEve = str[2].substring(2,4);
        // System.out.println(dayEve);
        if(dayEve.equals("AM")){
            System.out.println((hours.equals("12")?"00":hours) +":"+minutes+":"+seconds);
        }else{
            System.out.println((hours.equals("12")?hours:(Integer.parseInt(hours)+12))+":"+minutes+":"+seconds);
        }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
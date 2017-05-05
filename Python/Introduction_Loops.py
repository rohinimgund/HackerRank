'''
Task 
Read an integer . For all non-negative integers i< N, print i^2. See the sample for details.

Input Format

The first and only line contains the integer, N.

Constraints

1<=N<=20

Output Format

Print N lines, one corresponding to each .

Sample Input

5
Sample Output

0
1
4
9
16
'''

if __name__ == '__main__':
    n = int(input())
    
    if n>=0:
        for i in range(0,n):
            print(i*i);
    


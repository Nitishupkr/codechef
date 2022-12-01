/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
Scanner in=new Scanner(System.in);
int t=in.nextInt();
while(t-->0){
    int n=in.nextInt();
    int []arr=new int[n];
    int count=0;
    for(int i =0;i<n;i++){
        arr[i]=in.nextInt();
        
    }
    for(int i =0;i<n;i++){
        if(arr[i]%2!=0){
            count++;
        }
    }
    if(count!=0&&count%2==0){
        System.out.println("yes");
    }else{
        System.out.println("no");
    }
}
	}
}

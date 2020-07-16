/* 
Problem Link- https://www.codechef.com/problems/THESAV
package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String canFeedAllHouses(String inp){
        if(inp.charAt(0)=='0')
            return "NO";
        else{
            int counter= 2;
            for(int i=1; i<inp.length(); i++){
                if(inp.charAt(i)=='*')
                    counter= 2;
                else{
                    if(counter==0)
                        return "NO";
                    else
                        counter--;
                }
            }
            return "YES";
        }
    }
    public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc= new Scanner(System.in);
	    if(sc.hasNext()){
	        int t= sc.nextInt();
	        while(t-->0 && sc.hasNext()){
	            String inp= sc.next();
	            System.out.println(canFeedAllHouses(inp));
	            
	        }
	    }
	}
}

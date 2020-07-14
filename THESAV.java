/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String wasAbleToDistributeFood(String inp){
        if(inp.length()>0 && inp.charAt(0)=='0')
            return "NO";
        int count= 0, i;
        for(i=0; i< inp.length(); i++){
            switch(inp.charAt(i)){
                case '*': 
                    count= 2;
                    break;
                case '0':
                    if(count== 0)
                        return "NO";
                    count--;
            }
        }
        return "YES";
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    int t;
	    String currInp;
	    Scanner sc= new Scanner(System.in);
	    try{
	        if(sc.hasNext()){
	            t= sc.nextInt();
	            while(t--> 0 && sc.hasNext()){
	                currInp= sc.next();
	                System.out.println(wasAbleToDistributeFood(currInp));
	            }
	        }
	    }catch(Exception e){
	        System.out.println("Some exception occure "+ e);
	    }
	}
}

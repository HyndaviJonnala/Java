package com.kodnest.patterns.level4;

public class Program1 {
    public static void main(String []args)
    {
    	for(int i=1;i<=2;i++)
    	{
    		for(int j=1;j<=10;j++)
    		{
    			if(j<=5)
    			{
    				System.out.print("$");
    			}
    			else
    			{
    				System.out.print("*");
    			}
    		}
    		System.out.println();
    	}
    }
}

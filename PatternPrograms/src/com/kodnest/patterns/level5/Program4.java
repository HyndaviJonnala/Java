package com.kodnest.patterns.level5;

public class Program4 {
    public static void main(String []args)
    {
    	for(int i=1;i<=3;i++)
    	{
    		for(int j=1;j<=5;j++)
    		{
    			if(i==1 || i==3 || j==1 || j==5)
    			{
    				System.out.print("*");
    			}
    			else
    			{
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
}
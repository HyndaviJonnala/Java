package com.kodnest.patterns.level4;

public class Program7 {
    public static void main(String []args)
    {
    	for(int i=5;i>=1;i--)
    	{
    		for(int j=1;j<=i;j++)
    		{
    			System.out.print(" ");
    		}
    		for(int j=1;j<=i;j++)
    		{
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}

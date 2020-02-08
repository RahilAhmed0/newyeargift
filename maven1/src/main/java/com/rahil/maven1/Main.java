package com.rahil.maven1;

/*public class chocolate {

	public static void main(String[] args) {
		System.out.println("rahil Ahmed");

	}*/

//Java program to illustrate the 
//concept of Hierarchical inheritance 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

class Chocolate
{ 
	public void dairymilk() 
	{ 
		System.out.println("dairymilk"); 
	} 
} 

class Silk extends Chocolate
{ 
	public void silk() 
	{ 
		System.out.println("silk"); 
	} 
} 

class RoastedAlmond extends Chocolate 
{ 
	public void roast()
	{
	
	System.out.println("roasted almond");
	}
} 
 
public class Main 
{ 
	public static void main(String[] args) 
	{ 
		RoastedAlmond g = new RoastedAlmond(); 
		g.roast(); 
		Silk t = new Silk(); 
		t.silk(); 
		g.dairymilk(); 
	} 
} 


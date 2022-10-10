package com.Employee.Data;

public abstract class Language
{
     public void English()
	{
    	 System.out.println("Most Speaking language in the world");

	}
     public abstract void Hindi();
          
	public static void main(String[] args)
	{
    	 Language obj=new Speaking();
    	 
    	 obj.Hindi(); 
	}

}

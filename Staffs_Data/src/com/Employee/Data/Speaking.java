package com.Employee.Data;

public class Speaking extends Language
{
	@Override
	public void English()
	{
		super.English();
		System.out.println("It is common lang in India");
	}
	@Override
	public void Hindi()
	{
		System.out.println("only north indian people speaking hindi");
	}
	
}

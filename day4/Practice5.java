package com.capgemini.day4;

class Bank {
	//private int id;
	private long id;
	private String name;
	
	//public void setId(int id)
	public void setId(long id) 
	{
		this.id = id;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	//public int getId()
	public long getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
}
public class Practice5 {
	public static void main(String[] args) {
		Bank b1 = new Bank();
		//b1.setId(122);
		b1.setId(1234567890);
		b1.setName("SBI");
		System.out.println(b1.getId());
		System.out.println(b1.getName());
	}
}

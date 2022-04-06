package com.capgemini.day4;

interface Vehicle1 
{
	void bike1();

	void bike2();
}
interface Vehicle2 
{
		void bike1();
}
class Fly
{
	public void bike1(){ 
		String name = "Yamaha";
		float speed = 100;
		String fuel = "petrol";
		String color = "Black";
		System.out.println(name);
		System.out.println(speed);
		System.out.println(fuel);
		System.out.println(color);
	}
	public void bike2() {
		String name = "HERO";
		float speed = 80;
		String fuel = "petrol";
		String color = "Black";
		System.out.println(name);
		System.out.println(speed);
		System.out.println(fuel);
		System.out.println(color);
	}
}
public class Practice3 implements Vehicle1, Vehicle2
{
		public static void main(String[] args) 
		{
			new Fly().bike1();
			new Fly().bike2();
		}
		@Override
		public void bike1()
		 {
			// TODO Auto-generated method stub	
		}
		@Override
		public void bike2() {
			// TODO Auto-generated method stub	
		}
}


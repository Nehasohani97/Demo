package com.capgemini.day4;

//Rule1 ..interface have on defination of method
//Rule2 interface should be implemented by another class
//RUle 3 we can create the object of interface (mostly )
//Either class use the interface needs to implement the body of method
//interface start keyword interface 
//by default interface is abstract only
interface A {
  public void print();

}

class clasnname {

  // public void print();
}

interface B {
  public void print();
}

//interface will be implemented 
//class--extends--class
//interface -----implements----class
//implement interface A and interface b
class InterfaceImpl implements A, B {

  @Override
  public void print() {
      // TODO Auto-generated method stub
      System.out.println("print from class");
  }

}

public class PracticeInterface {
  
  public static void main(String[] args) {
      
  }
}


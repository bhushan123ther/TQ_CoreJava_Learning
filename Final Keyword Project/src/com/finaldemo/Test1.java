
package com.finaldemo;

//1. we can't create subclass to the class or we can't extends a class or we can't modify a class which is declared as final.
//2. we can't override a method or we can't modify a method in the sub class which is declared as final in the super class.

/*3. Any class or any method can be either abstract or final but not both. abstract and final are totally opposite. Because 
 abstract class or abstract method must be implemented or modified in the sub class but final does not allow this. This creates an ambiguity.

  final abstract class AnyClass
  {
      //Any class can not be final and abstract
 
       final abstract void methodOne();
       //method can not be final and abstract at a time
   }

*/
final class AnyClass {
	final int number = 10;

	final void methodOne() {
		// number = 20; //compile time error , final field can not be re-assigned.
	}
}

public class Test1 {
	public static void main(String[] args) {

	}
}

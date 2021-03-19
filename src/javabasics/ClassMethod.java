package javabasics;

public class ClassMethod extends Class2 {

	public void method1() {

		System.out.println("My First Method1");
	}

	public void method2() {

		System.out.println("My First Method2");
	}

	public static void main(String[] args) {

		System.out.println(" My First Program");

		ClassMethod obj1 = new ClassMethod();
		obj1.method1();
		obj1.method2();
		
		//Class2 obj2 = new Class2();
		obj1.method3();

	}

}

//Ctrl+Spacebar >> sysout
//CTRL+SHIFT+F
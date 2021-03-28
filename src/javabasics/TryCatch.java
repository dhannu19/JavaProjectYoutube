package javabasics;

public class TryCatch {

	public static void main(String[] args) {
		try {
		int a[] = {6,7,8,9,10,3};
		
		System.out.println("Array value :" +a[6]);
		   }catch(Exception e)
		{
			   System.out.println(e);
		}
		
		System.out.println("Code will run and will not stop");

	}

}

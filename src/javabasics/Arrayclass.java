package javabasics;

import java.util.ArrayList;
import java.util.Collections;

public class Arrayclass {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Tesla");
		cars.add("Honda");
		cars.add("BMW");
		cars.add("Toyola");

		System.out.println(cars);
		System.out.println(cars.get(1));
		System.out.println(cars.size());
		cars.remove(2);
		System.out.println("Sorting starts from here");
		Collections.sort(cars);

		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}

	}

}

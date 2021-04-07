package com.javaoop.objectmaster.tests;

import com.javaoop.objectmaster.models.Human;
import com.javaoop.objectmaster.models.Ninja;

public class NinjaTest {

	public static void main(String[] args) {
		Ninja n1 = new Ninja();
		Human h1 = new Human();
		
		System.out.println("\nN1:");
		n1.displayStats();
		n1.lifeSteal(h1);
		n1.displayStats();
		n1.runAway();
		n1.runAway();
		n1.displayStats();
		
		System.out.println("\nH1:");
		h1.displayStats();
		
		
	}

}

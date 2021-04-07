package com.javaoop.objectmaster.tests;

import com.javaoop.objectmaster.models.Human;
import com.javaoop.objectmaster.models.Samurai;

public class SamuraiTest {

	public static void main(String[] args) {
		Samurai s1 = new Samurai();
		Human h1 = new Human();
		
		System.out.println("\nS1:");
		s1.displayStats();
		
		System.out.println("\nH1:");
		h1.displayStats();
		s1.deathBlow(h1);
		h1.displayStats();
		
		System.out.println("\nS1:");
		s1.displayStats();
		s1.meditate();
		s1.displayStats();

	}

}

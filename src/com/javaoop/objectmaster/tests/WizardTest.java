package com.javaoop.objectmaster.tests;

import com.javaoop.objectmaster.models.Human;
import com.javaoop.objectmaster.models.Wizard;

public class WizardTest {

	public static void main(String[] args) {
		Wizard wiz1 = new Wizard();
		Wizard wiz2 = new Wizard();
		Human h1 = new Human();
		
		System.out.println("\nWiz1:");
		wiz1.displayStats();
		wiz2.heal(wiz1);
		wiz1.displayStats();
		wiz2.fireBall(wiz1);
		wiz1.displayStats();
		
		System.out.println("\nHuman:");
		h1.displayStats();
		wiz1.heal(h1);
		h1.displayStats();
		wiz1.fireBall(h1);
		h1.displayStats();
		
		
		

	}

}

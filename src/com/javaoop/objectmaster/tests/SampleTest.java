package com.javaoop.objectmaster.tests;

import com.javaoop.objectmaster.models.Human;
import com.javaoop.objectmaster.models.Ninja;
import com.javaoop.objectmaster.models.Samurai;
import com.javaoop.objectmaster.models.Wizard;

public class SampleTest {

	public static void main(String[] args) {
		Human human = new Human();
		human.displayStats();
		
		Ninja ninja = new Ninja();
		ninja.displayStats();
		
		Samurai samurai = new Samurai();
		samurai.displayStats();
		
		Wizard wizard = new Wizard();
		wizard.displayStats();
		
		wizard.fireBall(samurai);
		samurai.displayStats();
		
		human.attack(ninja);
		ninja.displayStats();
		
		ninja.runAway();
		ninja.displayStats();
		
		samurai.meditate();
		samurai.displayStats();
		
		wizard.heal(human);
		human.displayStats();
		
		ninja.attack(human);
		human.displayStats();
		

	}

}

package com.javaoop.objectmaster.models;

public class Wizard extends Human {

	public Wizard() {
		super();
		this.setHealth(50);
		this.setIntelligence(8);
	}

	public Wizard(int health, int strength, int stealth, int intelligence) {
		super(health, strength, stealth, intelligence);
		
	}
	
	public void heal(Human target) {
		System.out.printf("\nWizard Heal for: %d", this.getIntelligence());
		int targetHealth = target.getHealth();
		target.setHealth(targetHealth += this.getIntelligence());
	}
	
	public void fireBall(Human target) {
		System.out.printf("\nFire ball : -%d", (this.getIntelligence()*3));
		int targetHealth = target.getHealth();
		target.setHealth(targetHealth -= (this.getIntelligence()*3));
	}
	
}

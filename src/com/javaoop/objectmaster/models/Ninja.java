package com.javaoop.objectmaster.models;

public class Ninja extends Human {

	public Ninja() {
		super();
		this.setStealth(10);

	}

	public Ninja(int health, int strength, int stealth, int intelligence) {
		super(health, strength, stealth, intelligence);

	}
	
	public void lifeSteal(Human target) {
		System.out.printf("\nLife Steal for: %d", this.getStealth());
		int health = this.getHealth();
		int targetHealth = target.getHealth();
		target.setHealth(targetHealth -= this.getStealth());
		this.setHealth(health += this.getStealth());
	}
	
	public void runAway() {
		int health = this. getHealth();
		this.setHealth(health -= 10);
		System.out.printf("\nRunaway causes: -10 damage.");
	}

}

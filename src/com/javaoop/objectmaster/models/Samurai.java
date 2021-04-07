package com.javaoop.objectmaster.models;

public class Samurai extends Human {
	private static int numberOfSamurai = 0;
	public Samurai() {
		super();
		this.setHealth(200);
		numberOfSamurai++;
	}

	public Samurai(int health, int strength, int stealth, int intelligence) {
		super(health, strength, stealth, intelligence);
		numberOfSamurai++;
	}
	
	public void deathBlow(Human target) {
		target.setHealth(0);
		int health = this.getHealth();
		this.setHealth(health / 2);
		System.out.printf("\nDeath Blow : -%d to Samurai and kills target.");
	}
	
	public void meditate() {
		int health = this.getHealth();
		int healAmount = this.getHealth() / 2;
		this.setHealth(health += healAmount);
		System.out.printf("\nMeditate heals for: %d", healAmount);
	}
	
	public int howMany() {
		return numberOfSamurai;
	}

}

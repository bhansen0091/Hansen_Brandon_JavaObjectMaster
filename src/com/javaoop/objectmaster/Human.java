package com.javaoop.objectmaster;

public class Human {
	private int health = 100;
	private int strength = 3;
	private int stealth = 3;
	private int intelligence = 3;
	
	public Human() {
		this.health = 100;
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
	}
	
	public Human(int health, int strength, int stealth, int intelligence) {
		super();
		this.health = health;
		this.strength = strength;
		this.stealth = stealth;
		this.intelligence = intelligence;
	}

	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	public void displayStats() {
		int health = getHealth();
		int strength = getStrength();
		int stealth = getStealth();
		int intel = getIntelligence();
		System.out.printf("\nHealth: %d | Strength: %d | Stealth: %d | Intel: %d ", 
				this.health, 
				this.strength, 
				this.stealth, 
				this.intelligence);
	}
	
	public void attack(Human target) {
		target.health -= this.stealth;
	}
	
}

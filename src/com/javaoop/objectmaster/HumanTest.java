package com.javaoop.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		Human human1 = new Human();
		Human human2 = new Human();
		
		human1.displayStats();
		human2.displayStats();
		
		human1.attack(human2);
		human2.displayStats();
	}

}

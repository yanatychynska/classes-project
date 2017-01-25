/**
 * File Name: DomesticPetTest.java<br>
 * Tychynska, Yana<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 23, 2017
 */
package com.sqa.yt;

import org.junit.*;

/**
 * DomesticPetTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Tychynska, Yana
 * @version 1.0.0
 * @since 1.0
 */
public class DomesticPetTest {

	static private int numOfPets;

	static DomesticPet[] allPets = new DomesticPet[5];

	@Test
	public void testBird() {
		String expected =
				"DomesticPet [name=Chirpey, petType=BIRD, dateOfBirth=01/01/2017, typeOfNoise=squeek, mainFoodDish=cabbage, priceOfPurchase=1.0, averageyYearlyPetFees=100.0]";
		System.out.println("Testing Bird...");
		DomesticPet bird = new DomesticPet("Chirpey", PetType.BIRD, "01/01/2017",
				"squeek", "cabbage");
		System.out.println(bird.toString());
		this.allPets[0] = bird;
		testZooOfAnimals();
		Assert.assertEquals("Bird is not created correctly", expected, bird.toString());
	}

	@Test
	public void testCat() {
		String expected =
				"DomesticPet [name=Belly, petType=CAT, dateOfBirth=01/01/2017, typeOfNoise=meow, mainFoodDish=canfish, priceOfPurchase=1.0, averageyYearlyPetFees=100.0]";
		System.out.println("Testing Cat...");
		DomesticPet cat =
				new DomesticPet("Belly", PetType.CAT, "02/05/2016", "meow", "canfish");
		System.out.println(cat.toString());
		this.allPets[1] = cat;
		testZooOfAnimals();
		Assert.assertEquals("Cat is not created correctly", expected, cat.toString());
	}

	@Test
	public void testChicken() {
		String expected =
				"DomesticPet [name=Mary, petType=CHICKEN, dateOfBirth=01/01/2017, typeOfNoise=..., mainFoodDish=rice, priceOfPurchase=1.0, averageyYearlyPetFees=100.0]";
		System.out.println("Testing Chicken...");
		DomesticPet chicken =
				new DomesticPet("Mary", PetType.CHICKEN, "03/04/2016", "...", "rice");
		System.out.println(chicken.toString());
		this.allPets[2] = chicken;
		testZooOfAnimals();
		Assert.assertEquals("Chicken is not created correctly", expected,
				chicken.toString());
	}

	@Test
	public void testDog() {
		String expected =
				"DomesticPet [name=Lucky, petType=DOG, dateOfBirth=01/01/2017, typeOfNoise=woof, mainFoodDish=sausage, priceOfPurchase=1.0, averageyYearlyPetFees=100.0]";
		System.out.println("Testing Dog...");
		DomesticPet dog =
				new DomesticPet("Lucky", PetType.DOG, "04/03/2016", "woof", "sausage");
		System.out.println(dog.toString());
		this.allPets[3] = dog;
		testZooOfAnimals();
		Assert.assertEquals("Dog is not created correctly", expected, dog.toString());
	}

	@Test
	public void testFish() {
		String expected =
				"DomesticPet [name=Lulu, petType=FISH, dateOfBirth=01/01/2017, typeOfNoise=..., mainFoodDish=bread, priceOfPurchase=1.0, averageyYearlyPetFees=100.0]";
		System.out.println("Testing Fish...");
		DomesticPet fish =
				new DomesticPet("Lulu", PetType.FISH, "12/12/2016", "...", "bread");
		System.out.println(fish.toString());
		this.allPets[4] = fish;
		testZooOfAnimals();
		Assert.assertEquals("Fish is not created correctly", expected, fish.toString());
	}

	public void testZooOfAnimals() {
		this.numOfPets++;
		if (this.numOfPets >= 5) {
			for (int i = 0; i < this.allPets.length; i++) {
				this.allPets[i].buyPet();
				this.allPets[i].makeSound();
				this.allPets[i].eat();
			}
		}
	}
}

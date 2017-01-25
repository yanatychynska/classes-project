/**
 * File Name: LizardClass.java<br>
 * Tychynska, Yana<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 25, 2017
 */
package com.sqa.yt;

/**
 * LizardClass //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Tychynska, Yana
 * @version 1.0.0
 * @since 1.0
 */
public class LizardClass {

	private String name;

	private String petType;

	private int age;

	private String mainDish;

	private String placeOfLiving;

	private double priceOfPurchase;

	// setting default values
	public LizardClass() {
		this.name = "Unknown Lizard";
		this.petType = "lizard";
		this.mainDish = "fish";
		this.placeOfLiving = "Indonesia";
		this.priceOfPurchase = 100.0;
		this.age = 30;
	}

	/**
	 * @param args
	 */
	public LizardClass(String name, String petType, String color, String mainDish,
			String placeOfLiving, double priceOfPurchase) {
		this.name = name;
		this.petType = petType;
		this.mainDish = mainDish;
		this.placeOfLiving = placeOfLiving;
		this.priceOfPurchase = priceOfPurchase;
		this.age = this.age;
	}

	public void eat() {
		System.out.println("This " + this.name + " eats " + this.mainDish + ".");
	}

	public int getAge() {
		return this.age;
	}

	public String getMainDish() {
		return this.mainDish;
	}

	public String getName() {
		return this.name;
	}

	public String getPetType() {
		return this.petType;
	}

	public String getPlaceOfLiving() {
		return this.placeOfLiving;
	}

	public double getPriceOfPurchase() {
		return this.priceOfPurchase;
	}

	public void liveArea() {
		System.out.println(
				this.name + "lives" + this.placeOfLiving + "and is " + this.age + ".");
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setMainDish(String mainDish) {
		this.mainDish = mainDish;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public void setPlaceOfLiving(String placeOfLiving) {
		this.placeOfLiving = placeOfLiving;
	}

	public void setPriceOfPurchase(double priceOfPurchase) {
		this.priceOfPurchase = priceOfPurchase;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LizardClass [name=");
		builder.append(this.name);
		builder.append(", petType=");
		builder.append(this.petType);
		builder.append(", age=");
		builder.append(this.age);
		builder.append(", mainDish=");
		builder.append(this.mainDish);
		builder.append(", placeOfLiving=");
		builder.append(this.placeOfLiving);
		builder.append(", priceOfPurchase=");
		builder.append(this.priceOfPurchase);
		builder.append("]");
		return builder.toString();
	}
}

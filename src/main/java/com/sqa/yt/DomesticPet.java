/**
 * File Name: DomesticPet.java<br>
 * Tychynska, Yana<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 23, 2017
 */
package com.sqa.yt;

/**
 * DomesticPet //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Tychynska, Yana
 * @version 1.0.0
 * @since 1.0
 */
public class DomesticPet {

	private PetType petType;

	private double averageyYearlyPetFees;

	private String mainFoodDish;

	private String typeOfNoise;

	private String name;

	private double priceOfPurchase;

	// Format: MM/DD/YYYY
	private String dateOfBirth;

	// setting a default values
	public DomesticPet() {
		this.name = "Unknown Pet";
		this.petType = null;
		this.dateOfBirth = "01/01/2017";
		this.typeOfNoise = "...";
		this.mainFoodDish = "cabbage";
		this.priceOfPurchase = 1.0;
		this.averageyYearlyPetFees = 100.0;
	}

	public DomesticPet(String name, PetType petType) {
		this();
		this.name = name;
		this.petType = petType;
	}

	public DomesticPet(String name, PetType petType, String dateOfBirt,
			String typeOfNoise) {
		this(name, petType);
		this.dateOfBirth = this.dateOfBirth;
		this.typeOfNoise = typeOfNoise;
	}

	public DomesticPet(String name, PetType petType, String dateOfBirth,
			String typeOfNoise, String mainFoodDish) {
		this(name, petType, dateOfBirth, typeOfNoise);
		this.mainFoodDish = mainFoodDish;
	}

	public DomesticPet(String name, PetType petType, String dateOfBirth,
			String typeOfNoise, String mainFoodDish, double priceOfPurchase,
			double averageyYearlyPetFees) {
		super();
		this.name = name;
		this.petType = petType;
		this.dateOfBirth = dateOfBirth;
		this.typeOfNoise = typeOfNoise;
		this.mainFoodDish = mainFoodDish;
		this.priceOfPurchase = priceOfPurchase;
		this.averageyYearlyPetFees = averageyYearlyPetFees;
	}

	public void buyPet() {
		System.out.println("I bought " + this.getName() + " for only "
				+ this.getPriceOfPurchase() + " and they only cost me "
				+ this.getAverageyYearlyPetFees() + " a year. /n I love this "
				+ this.getPetType().toString().toLowerCase() + "!");
	}

	public void eat() {
		System.out.println("This " + this.getPetType().toString().toLowerCase()
				+ " loves " + this.getMainFoodDish() + ".");
	}

	/**
	 * @return the averageyYearlyPetFees
	 */
	public double getAverageyYearlyPetFees() {
		return this.averageyYearlyPetFees;
	}

	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return this.dateOfBirth;
	}

	/**
	 * @return the mainFoodDish
	 */
	public String getMainFoodDish() {
		return this.mainFoodDish;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return the petType
	 */
	public PetType getPetType() {
		return this.petType;
	}

	/**
	 * @return the priceOfPurchase
	 */
	public double getPriceOfPurchase() {
		return this.priceOfPurchase;
	}

	/**
	 * @return the typeOfNoise
	 */
	public String getTypeOfNoise() {
		return this.typeOfNoise;
	}

	public void makeSound() {
		System.out.println(this.name + " makes sound " + this.getTypeOfNoise() + ".");
	}

	/**
	 * @param averageyYearlyPetFees
	 *            the averageyYearlyPetFees to set
	 */
	public void setAverageyYearlyPetFees(double averageyYearlyPetFees) {
		this.averageyYearlyPetFees = averageyYearlyPetFees;
	}

	/**
	 * @param mainFoodDish
	 *            the mainFoodDish to set
	 */
	public void setMainFoodDish(String mainFoodDish) {
		this.mainFoodDish = mainFoodDish;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param priceOfPurchase
	 *            the priceOfPurchase to set
	 */
	public void setPriceOfPurchase(double priceOfPurchase) {
		this.priceOfPurchase = priceOfPurchase;
	}

	/**
	 * @param typeOfNoise
	 *            the typeOfNoise to set
	 */
	public void setTypeOfNoise(String typeOfNoise) {
		this.typeOfNoise = typeOfNoise;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DomesticPet [name=");
		builder.append(this.name);
		builder.append(", petType=");
		builder.append(this.petType);
		builder.append(", dateOfBirth=");
		builder.append(this.dateOfBirth);
		builder.append(", typeOfNoise=");
		builder.append(this.typeOfNoise);
		builder.append(", mainFoodDish=");
		builder.append(this.mainFoodDish);
		builder.append(", priceOfPurchase=");
		builder.append(this.priceOfPurchase);
		builder.append(", averageyYearlyPetFees=");
		builder.append(this.averageyYearlyPetFees);
		builder.append("]");
		return builder.toString();
	}
}

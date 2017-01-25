/**
 * File Name: PersonTest.java<br>
 * Tychynska, Yana<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 21, 2017
 */
package com.sqa.yt;

import org.junit.*;

/**
 * PersonTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Tychynska, Yana
 * @version 1.0.0
 * @since 1.0
 */
public class PersonTest {

	@Test
	public void test() {
		Person person1 = new Person("John");
		Person person2 = new Person("Yana", 29, 'F', "CSM", 25.0, "8 Pacific Bay Cir", true);
		Person person3 = new Person("Jake", 30, 'M', "Developer", 40.0, "2321 Cecilia Ave", true);
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		String[] names = { "Yana", "Anya", "Yuliya", "Marta" };
		// Person[] people = new Person[5];
		// for (int i = 0; i < people.length; i++) {
		// people[i] = new Person(names[i]);
		// people[i].sleep();
		// people[i].doWork();
		// people[i].eat("Banana", "Apple", "Coffee");
		// people[i].sleep();
		// people[i].sleep();
		// person3.sleep
		person3.sleep();
	}
}

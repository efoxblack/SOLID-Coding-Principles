package srp;

// First principle of SOLID is Single Responsibility Principle (SRP)

/*
 * This principle means that every class, or a similar structure (interface, enum, etc.) should have only one job to do.
 * This does not mean of course that your class should be limited to one method or property.
 * As long as your class maintains the same responsibility you can have as many methods or properties as you want.
 * How many responsibilities are there? 
 * 3
 * Demonstrated below would be 
 * 1. Calculation logic
 * 2. Database logic
 * 3. Reporting logic
 * If you have multiple responsibilities in one class it may be hard to understand it and make fixes to the code.
 * The easiest fix to this is splitting up the responsibilities into different classes.
 * So for example you might split this into three classes: 
 * One for database access
 * One for calculating pay
 * One for reporting things
 */

public class Employee {
	
		public Pay calculatePay() {
			return new Pay();
		}

		public void save() {
			
		}
		
		public String describeEmployee() {
			return "This is a good employee";
		}
		
		
}

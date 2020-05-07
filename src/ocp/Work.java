package ocp;

//Second Principle of SOLID is Open-Closed Principle (OCP) 

	/*
	 * This principle states that classes should be open for extension but closed for modification.
	 * Open for extension means that you should design your code to accept new functionality
	 * as new requirements are issued.
	 * Closed for modification means that once you have designed your code you should never modify it,
	 * except to correct bugs.
	 * While these two things may be sound contradictory, if you structure your classes/code correctly
	 * you can add functionality without editing existing source code.
	 * Generally you can achieve this by referring to abstractions for dependencies, such as interfaces
	 * or abstract classes. Functionality can be added by creating new classes that implement the interfaces.
	 * 
	 * The example below displays this:
	 */

public class Work {

//	void checkOut(Receipt receipt) { 
//		Money total = Money.zero;
//		for (item : items) {
//			total += item.getPrice();
//		    receipt.addItem(item);
//		    }
//		Payment p = acceptCash(total);
//		receipt.addPayment(p);
//		}
	
	
	// What if we want to add credit card support?
	
//	Payment p;
//	if (credit)
//	  p = acceptCredit(total);
//	else
//	  p = acceptCash(total);
//	receipt.addPayment(p);
	
	// We could do this ^ but that would violate OCP

//	void checkOut(Receipt receipt, PaymentMethod pm) {
//		Money total = Money.zero;
//		for (Object item : items) {
//			total += item.getPrice();
//			receipt.addItem(item);
//		}
//		Payment p = pm.acceptPayment(total);
//		receipt.addPayment(p);
//	}
	
	// Instead we create an interface to utilize abstractions

}

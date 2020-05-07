package isp;

// Fourth principle of SOLID is Interface Segregation Principle (ISP) 

/*
 * This principle states that those using your code should not depend
 * on interface methods they will not use.
 * ISP tells us to make smaller, more cohesive interfaces.
 * Smaller interfaces are easier to implement, improving flexibility
 * and the possibility of reuse.
 * Basically saying don't depend on what you don't use.
 */

public interface IMessenger {
	
	void askForCard();
	void tellInvalidCard();
	void askForPin();
	void tellInvalidPin();
	void tellCardWasSiezed();
	void askForAccount();
	void tellNotEnoughMoneyInAccount();
	void tellAmountDeposited();
	void tellBalance();

}

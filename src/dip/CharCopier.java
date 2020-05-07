package dip;

// Fifth principle of SOLID is Dependency Inversion Principle (DIP)

/*
 * This principle states that high-level modules should not depend on low-level modules.
 * Instead they should depend on abstractions. Also abstractions should not depend 
 * upon details; details should depend upon abstractions. The idea is that we isolate our
 * class behind the abstraction it depends on. If all the details behind the abstraction
 * changes, our class will still be safe.
 */

public class CharCopier {
	
	void copy(IReader reader, IWriter writer) {
		int c;
		while ((c = reader.getChar()) != EOF) {
			writer.putChar((char) c);
		}
	}
}

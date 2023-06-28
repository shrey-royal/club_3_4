/*
Java -> 


Development Environment


JDK -> 1. JRE -> 2. JVM

JVM -> Java Virtual Machine (an abstract machine)

-> provides the runtime environment for the java bytecode to get executed.

JVM performs following tasks:

-> Loads Code
-> Verifies Code
-> Executes Code
-> provides runtime environment


JRE -> Java Runtime Environment

-> it is a set of software tools which are used for developing apps


JDK -> Java Development Kit

-> it is a software development environment which is used to develop java apps and applets.

-> It contains Java RTE + development tools


Q. What happens when we compile and run a java program?

At Compile Time

Java Source Code (.java) -> Compiler -> Byte Code (.class)

At Run Time

Class File (.class) -> Classloader -> Bytecode Verifier -> Interpreter -> Runtime -> Hardware



*/
public class Sample {
	public static void main(String[] args) {
		System.out.println("abcd");
		
		/*
		for (int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		*/
		
		System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
	}
}

/*
data type: 

Primitive: boolean, char, byte, short, int, long, float and double.

Non-Primitive: classes, interfaces and arrays.

*/
package javadoc;
/**
 * 
 * @author Ehtezaz Ahmed
 * @version 1.0
 */
public class Main {
/**
 * This is the Main Method.
 * @param args is used to load main method.
 * <h2><br><hr>Steps: </h2>
	 * <ol>
	 * <li>This is a default Constructor that uses two variable numbreOne and numberTwo.</li>
	 * <li>Create an Object of Extended Class.</li>
	 * <li>Get the value num3 from Extended Class and also show the value of num1 from class javaDocumentationClass.</li>
	 * <li>Get the value num4 from Extended Class.</li>
	 * </ol>
	 
 */
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		int numberOne;
		int numberTwo;
		
		ExtentedClass ex_Class = new ExtentedClass();
		numberOne = ex_Class.getNumber1();
		numberTwo = ex_Class.getNumber2();
		
		System.out.println("Number 1 = " + numberOne);
		System.out.println("Number 2 = " + numberTwo);
		
		
		

	}

}

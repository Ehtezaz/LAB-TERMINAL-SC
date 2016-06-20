package javadoc;
// TODO: Auto-generated Javadoc

/**
 * The Class ExtentedClass.
 *
 * @author Ehtezaz Ahmed
 * @version 1.0
 */

public class ExtentedClass extends JavaDocumentation{
	/**
	 * This class ExtentedClass extends Class Java Documentation. 
	 */
	private int num3;//declare num3 variable.
	
	/** The num4. */
	private int num4;//declare num4 variable.
	/**
	 * This is a default constructor that initialise the num1 and num2 values to zero.
	 */
	public ExtentedClass() {
		// TODO Auto-generated constructor stub
		//This is a constructor that initialise the num1 and num2 values to zero.
		num3 = 0;//num1 is assign value zero.
		num4 = 0;//num2 is assign value zero.
	}
	/**
	 * this Method Multiply the numbers and store in result variable and then displays the result. 
	 */
	public void multiplyNumbers() {
		int result = 0;//initialise result to zero.
		result = num3*num4;
		System.out.print("Multiplication = " + result);
	}
	
	/**
	 * Sets the number.
	 *
	 * @param setNum1 is an integer that sets the num1 value to setNum1 that is given by user.
	 * @param setNum2 is an integer that sets the num2 value to setNum2 that is given by user.
	 */
	/**
	 * this is setNumber function that set the num1 and num2 values.
	 */
	@Override
	public void setNumber(int setNum1, int setNum2) {
		//set integer num1 and num2 to zero.
		num3 = setNum1;//num3 is assign value setNum1.
		num4 = setNum2;//num4 is assign value setNum2.
	}
	
	/**
	 * Gets the number1.
	 *
	 * @return num1 value to the user.
	 */
	/**
	 * <h2>getNumber1 Function</h2>
	 *<p>This Function Show the num1 value from JavaDocumentationClass which is parent class. 
	 * and this is getNumber1 function that return the first value num3.</p>
	 */
	@Override
	public int getNumber1(){
		//return num1 value.
		int numSuper = super.getNumber1();
		System.out.println(numSuper);//
		return num3;//return num1 value.
	}
	
	
	/**
	 * Gets the number2.
	 *
	 * @return num4 value to the user.
	 */
	/**
	 * this is getNumber2 function that return the second value num4.
	 */
	@Override
	public int getNumber2(){
		//return num2 value.
		return num4;//return num1 value.
	}
	/**
	 * Check FindBug plug-in.
	 */
	
}

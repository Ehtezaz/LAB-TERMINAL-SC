package javadoc;
/**
 * 
 * @author Ehtezaz Ahmed
 * @version 1.0
 */
public class JavaDocumentation {
/**
 * 
 */
	private int num1;//declare num1 variable.
	private int num2;//declare num2 variable.
	/**
	 * This is a default constructor that initialise the num1 and num2 values to zero.
	 */
	public JavaDocumentation() {
		//This is a constructor that initialise the num1 and num2 values to zero.
		num1 = 0;//num1 is assign value zero.
		num2 = 0;//num2 is assign value zero.
	}
	/**
	 * 
	 * @param setNum1 is an integer that sets the num1 value to setNum1 that is given by user. 
	 * @param setNum2 is an integer that sets the num2 value to setNum2 that is given by user.
	 */
	/**
	 * this is setNumber function that set the num1 and num2 values.
	 */
	public void setNumber(int setNum1, int setNum2) {
		//set integer num1 and num2 to zero.
		num1 = setNum1;//num1 is assign value setNum1.
		num2 = setNum2;//num2 is assign value setNum2.
	}
	/**
	 * 
	 * @return num1 value to the user.
	 */
	/**
	 * this is getNumber1 function that return the first value num1.
	 */
	public int getNumber1(){
		//return num1 value.
		return num1;//return num1 value.
	}
	/**
	 * 
	 * @return num2 value to the user.
	 */
	/**
	 * this is getNumber2 function that return the second value num2.
	 */
	public int getNumber2(){
		//return num2 value.
		return num2;//return num1 value.
	}
	
	/**
	 * This Function addNumber Adds the num1 and num2 values.
	 */
	public void addNumber() {
		//integer addNumbers store the result of num1 and num2
		int addNumbers = 0;
		addNumbers = num1+num2;//adds two numbers.
		System.out.print("Sum of the Numbers is = " + addNumbers);//generate the output to the screen.
	}
}

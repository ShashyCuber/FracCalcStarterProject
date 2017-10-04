//Shashwat Sparsh
package fracCalc;

import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	String equation = sc.nextLine();
    	System.out.println(produceAnswer(equation));
    	sc.close();
    	// TODO: use Scanner to read in an equation from the user and print out it's answer
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
    	String operand1, operator, operand2, result;
    	int firstIndex, secondIndex, thirdIndex, stringLength;
    	stringLength = input.length();
    	firstIndex = input.indexOf(" ");
    	secondIndex = input.indexOf(" ", firstIndex + 1);
        
    	operand1 = input.substring(0, firstIndex);
    	operator = input.substring(firstIndex + 1, secondIndex);
    	operand2 = input.substring(secondIndex + 1);

    	int wholeNum1 = getWholeNum(operand1);
    	int numerator1  = getNumerator(operand1);
    	int denominator1 = getDenominator(operand1);
    	
    	int wholeNum2 = getWholeNum(operand2);
    	int numerator2 = getNumerator(operand2);
    	int denominator2 = getDenominator(operand2);
    	
    	//result = ("whole:" + wholeNum2 + " numerator:" + numerator2 + " denominator:" + denominator2);
       	
    	String fraction1 = convertToImproperFrac(operand1);
    	String fraction2 = convertToImproperFrac(operand2);
    	
    	int numeratorFrac1 = getNumerator(fraction1);		//a
    	int denominatorFrac1 = getDenominator(fraction1); 	//b
    	int numeratorFrac2 = getNumerator(fraction2);		//c	
    	int denominatorFrac2 = getDenominator(fraction2);	//d
    	
    	int newNumerator, newDenominator;
    	
    	
    	if (operator.equals("*"))
    	{   
    		newNumerator = (numeratorFrac1 * numeratorFrac2);
    		newDenominator = (denominatorFrac1 * denominatorFrac2);
    		if (newNumerator == 0)
        	{
        		result = "0";
        	}
    		result = "" + newNumerator + "/" + newDenominator;
        	//return result;
    	}
    	else if (operator.equals("/"))
    	{
    		newNumerator = (numeratorFrac1 * denominatorFrac2);
    		newDenominator = (denominatorFrac1 * numeratorFrac2);
    		if (newNumerator == 0)
        	{
        		result = "0";
        	}
    		result = "" + newNumerator + "/" + newDenominator;
    		//return result;
    	}
    	else if (operator.equals("+"))
    	{
    		newNumerator = ((numeratorFrac1 * denominatorFrac2) + (numeratorFrac2 * denominatorFrac1));
    		newDenominator = (denominatorFrac1 * denominatorFrac2);
    		if (newNumerator == 0)
        	{
        		result = "0";
        	}
    		result = "" + newNumerator + "/" + newDenominator;
    		//return result;
    	}
    	else if (operator.equals("-"))
    	{
    		newNumerator = ((numeratorFrac1 * denominatorFrac2) - (numeratorFrac2 * denominatorFrac1));
    		newDenominator = (denominatorFrac1 * denominatorFrac2);
    		if (newNumerator == 0)
        	{
        		result = "0";
        	}
    		result = "" + newNumerator + "/" + newDenominator;
    		//return result;
    	}
    	else
    	{
    		result = ("whole:" + wholeNum2 + " numerator:" + numerator2 + " denominator:" + denominator2);
    	}
    	
    	
    	return result;
    	
    }
    
    public static int getWholeNum (String input)
    {
    	String wholeNum;
    	int result;
    	if (input.contains("_"))
    	{
    		int underscore = input.indexOf("_");
    		if (input.startsWith("-"))
    		{
    			wholeNum = input.substring(1, underscore);
    			result = -1 * (stringToInt(wholeNum));
    			System.out.println(result);
    			//return result;
    		}
    		else
    		{
    		wholeNum = input.substring(0, underscore);
    		result  = stringToInt(wholeNum);
    		}
    	} 
    	else if (input.contains("/"))
    	{
    		result = 0;
    	}
    	else
    	{
    		result = stringToInt(input);
    	}
    	return result;
    	
    	/*
    	String wholeNum;
    	if (input.contains("_"))
    	{
    		int underscore = input.indexOf("_");
    		if (input.contains("-"))
    		{
    			int negativeSign = input.indexOf("-");	
    			wholeNum = input.substring(negativeSign + 1,underscore);
    			int newNum = stringToInt(wholeNum) * -1;
        		return newNum;
    		}
    		else
    		wholeNum = input.substring(0,underscore);
    		int newNum = stringToInt(wholeNum);
    		return newNum;
    	}
    	else if (input.contains("/"))
    	{
    		return 0;
    	}
    	else
    	return stringToInt(input);
    	*/
    }
    
    public static int getNumerator (String operand)
    {
    	String numerator;
    	if (operand.contains("_"))
    	{
    		int underscore = operand.indexOf("_");
    		if (operand.contains("/"))
        	{
        		int slash = operand.indexOf("/");
        		numerator = operand.substring(underscore + 1, slash);
        		return stringToInt(numerator);
        	}
    		return 0;
    	}
    	else if (operand.contains("/"))
    	{
    		int slash = operand.indexOf("/");
    		numerator = operand.substring(0, slash);
    		return stringToInt(numerator);
    	}
    		return 0;
    }
    
    public static int getDenominator (String operand)
    {
    	String denominator;
    	if (operand.contains("/"))
    	{
    		int slash = operand.indexOf("/");
    		denominator = operand.substring(slash + 1);
    		return stringToInt(denominator);
    	}
    	return 1;
    }
    
    //public static String convertToMixedNum (Stirng operand)
    
    public static String convertToImproperFrac (String operand)
    {
    	int wholeNum = getWholeNum(operand);
    	int numerator = getNumerator(operand);
    	int denominator = getDenominator(operand);
    	int newNumerator;
    	if (wholeNum < 0)
    	{
    		int absoluteWholeNum = Math.abs(wholeNum);
    		newNumerator = -1 * ((absoluteWholeNum * denominator) + numerator);
    	}
    	else
    	{
    		newNumerator = (wholeNum * denominator) + numerator;	
    	}
    	String result = newNumerator + "/" + denominator;
    	return result;
    }


	// This function takes a string and returns an int
	// Note: you can only call this function with a String that contains only digits!
	//  stringToInt("52") will return the int value 52, 
    // stringToInt("-25") will return the int value -25
    public static int stringToInt (String numstr) {
    	return new Integer(numstr).intValue();
    }
    
    /** return the greatest Common factor of 
     * two int values a and b
     * Note: both a and b must be >= 0!
     * For example the greatestCommonFactor of 8 and 12 is 4
     * because 8 % 4 == 0 AND 12 % 4 == 0
     */
    public static int gcf (int a, int b) {
        if (b == 0) return a;
        int remainder = a % b;
        
        return (gcf (b, remainder));
    }
}

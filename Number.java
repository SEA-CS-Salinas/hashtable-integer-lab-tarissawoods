/**
This class is so we can acces the HistoNode, it was already been wriiten
@author Ta'Rissa Woods
@ version %I% %G%
*/
public class Number
{
/**
instane variable for the value of the number
*/
	private int theValue;

/**
Parameterized constructor for the number class
@param for the value wanting to be inputed
*/
	public Number(int value)
	{
	    theValue = value;
	}	
/**
method to get a value
@return the value that is being got
*/	
	public int getValue()
	{
		return theValue;
	}
/**
method to check if an object equalses the value instance variable
@param the object that is to be compared with the value instance variable
@return true if the values match, false if they don't
*/	
	public boolean equals(Object obj)
	{
	    if (theValue == obj.getValue()) {
			return true;
		}
		else {
			return false;
		}
	} 
/**
method to change the value in a hash code 
@return the hash code value of the value instance variable
*/	
	public int hashCode()
	{
		return theValue%10;
	}

/**
method to print the expresion in string form 
@return a string of the expression like "VALUE OF THE NUMBER: 2"
*/
	public String toString()
	{
		return "VALUE OF THE NUMBER: " + theValue;
	}	
}

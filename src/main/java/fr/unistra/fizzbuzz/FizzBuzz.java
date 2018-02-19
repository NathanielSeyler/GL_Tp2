package fr.unistra.fizzbuzz;

public class FizzBuzz /*implements Int2String*/ {


	public String convert(int number)
	{
		String rtn = "";
		if(number % 3 ==0)
			rtn += "Fizz";
		if(number % 5 == 0)
			rtn +="Buzz";
		if (rtn.isEmpty())
			return Integer.toString(number);
		else
			return rtn;
	}
}

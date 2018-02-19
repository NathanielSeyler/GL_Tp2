package fr.unistra.fizzbuzz;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
	int i;
	FizzBuzz f = new FizzBuzz();
	for(i=1;i<=100;i++)
		System.out.println(f.convert(i));
    }
}

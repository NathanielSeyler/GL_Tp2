package fr.unistra.fizzbuzz;

/**
 * Hello world!
 *
 */
public class App implements Displayer
{
	public void display(String str)
	{
		System.out.println(str);
	}
    public static void main( String[] args )
    {
		Displayer printer = new App();
		Int2String fizzbuzz = new FizzBuzz();
		ProblemSolver solver = new ProblemSolver(printer,fizzbuzz);
		solver.solve(100);
        System.out.println( "Hello World!" );
    }
}

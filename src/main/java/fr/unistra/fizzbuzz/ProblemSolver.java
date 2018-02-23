package fr.unistra.fizzbuzz;

public class ProblemSolver{
	
	private Displayer printer;
	private Int2String converter;
	
	public ProblemSolver(Displayer d,Int2String c)
	{
		printer =d;
		converter = c;
	}

	public void solve(int max)
	{
		int i;
		for(i=1;i<=max;i++)	
			printer.display(converter.convert(i));
	}
}


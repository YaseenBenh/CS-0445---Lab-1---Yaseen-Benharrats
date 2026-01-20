public class Lab1
{
	public static void main(String [] args)
	{
		Worker [] staff = new Worker[5];
		// Classes Salaried and Hourly extend Worker and both override the
		// toString() and income() methods. toString() should add the pay info
        // to the string produced by the superclass, and income() should 
        // return the annual wage of the worker.  See the required output
		// format in the Lab 1 Document. There are more comments in Worker.java.
		
		// For class Salaried, the first argument to the constructor is the last
		// name of the worker, the second argument is the first name of the worker
		// and the third argument is the annual salary.
		
		// For class Hourly, the first argument to the constructor is the last
		// name of the worker, the second argument is the first name of the worker
		// the third argument is the hours worked per year and the fourth argument 
		// is the pay per hour.
		
		// Look at the Worker constructor and see how you can use that in your
		// writing of the constructors for Salaried and Hourly.
		
		staff[0] = new Salaried("Dunham", "Olivia", 75000.00);
		staff[1] = new Hourly("Bishop", "Peter", 2000, 30.0);
		staff[2] = new Hourly("Bishop", "Walter", 1500, 10.0);
		staff[3] = new Hourly("Farnsworth", "Astrid", 1800, 20.0);
		staff[4] = new Salaried("Broyles", "Phillip", 50000.00);
		
		// Note carefully the output in the Lab 1 document to determine how you
		// must override toString() for each subclass.
		for (int i = 0; i < staff.length; i++)
		{
			System.out.println(staff[i].toString());
			System.out.println();
		}
		
		for (int i = 0; i < staff.length; i++)
		{
			System.out.println(staff[i].getName() + " makes " + staff[i].income() + 
							   " per year ");
		}
	}
}
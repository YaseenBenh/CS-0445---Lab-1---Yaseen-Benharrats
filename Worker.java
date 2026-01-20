public abstract class Worker
{
	// Note that names are private and thus cannot be directly accessed even
	// in a subclass.  Often data in a superclass will be declared as
	// protected, but in this case access is restricted to the superclass only.
	private String fname;
	private String lname;
	
	public Worker(String last, String first)
	{
		fname = new String(first);
		lname = new String(last);
	}
	
	// Return first name of the Worker
	public String getName()
	{
		return fname;
	}
	
	// Abstract method to return annual income of the Worker.
	// This must be overridden appropriately by the subclasses.
	public abstract double income();
	
	// Return the labeled full name of the Worker
	public String toString()
	{
		return("Name: " + fname + " " + lname);
	}
}
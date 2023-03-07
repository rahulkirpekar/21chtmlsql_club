package doubts;

public enum Color 
{
	RED, YELLOW,WHITE,BLACK;

	// enum constructor called separately for each
	// constant
	private Color()
	{
		System.out.println("Constructor called for : "
						+ this.toString());
	}

	public void colorInfo()
	{
		System.out.println("Universal Color");
	}

}


public class Triangle {

	int sideOne = 0;
	int sideTwo = 0;
	int sideThree = 0;
	
	public void setSideOne(int sOne)
	{
		sideOne = sOne;
	}
	
	public int getSideOne ()
	{
		
		return sideOne;
	}
	
	public void setSideTwo(int sTwo)
	{
		sideTwo = sTwo;
	}
	
	public void setSideThree(int sThree)
	{
		sideThree = sThree;
	}
	
	public String getType()
	{
		if (sideOne == sideTwo)
		{
			if (sideTwo == sideThree)
			{
				return "You have an Equilateral Triangle";
			}
			else
			{
				return "You have an Isoceles Triangle";
			}
		}
		else
		{
			if (sideOne == sideThree)
			{
				return "You have an Isoceles Triangle";
			}
			if (sideTwo == sideThree)
			{
				return "You have an Isoceles Triangle";
			}
			else
			{
			return "You have a Scalene Triangle";
			}
		}
	}
	
	public void CalculateArea(int sOne, int sTwo)
	{
		int width = 0;
		width = (int) (.5 * sOne);
		
		int height = 0;
		
		height = (int) Math.sqrt((width * width) + (sTwo * sTwo));
		
		int areaTriangle = 0;
		
		areaTriangle = (width * height) / 2; 
		
		System.out.println(areaTriangle);
		
		
		
	}
	
	
	
	
}

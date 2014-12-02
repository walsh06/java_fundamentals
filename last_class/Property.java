public class Property
{
	private String id;
	private int type, numberOfOccupants; 
	private double income, charge;
	private boolean water, sewerage;

	public Property(String id, int type, int numberOfOccupants, 
					double income, boolean water, boolean sewerage)
	{
		this.id = id;
		this.type = type;
		this.numberOfOccupants = numberOfOccupants;
		this.income = income;
		this.water = water;
		this.sewerage = sewerage;

		this.charge = calcularePropertyCharge();
	}

	private double calcularePropertyCharge()
	{
		double charge = 100.0;
		if(income > 0)
		{
			if(income < 15000)
			{
				charge+=200;
			}
			else if(income < 20000)
			{
				charge+=300;
			}
		}

		if(water)
		{
			charge+=50;
		}

		if(sewerage)
		{
			charge+=50;
		}

		return charge;
	}

	public String getID()
	{
		return id;
	}

	public boolean isWater()
	{
		return water;
	}

	public int getType()
	{
		return type;
	}

	public String getNameType()
	{
		if(type == 1)
		{
			return "Apartment";
		}
	}

} 
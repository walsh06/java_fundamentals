public class SoftwareProject
{
	private double cost;
	private char category, key;
	private String customer;

	public SoftwareProject(String customer, char category, char key)
	{
		this.customer = customer;
		this.category = category;
		this.key = key;

		this.cost = calcProjectCost();
	}

	private double calcProjectCost()
	{
		double cost = 10000;

		if(key == 'D')
		{
			if(category == 'S')
			{
				cost += 5600.5;
			}
			else if(category == 'M')
			{
				cost += 10600.5;
			}
			else
			{
				cost += 17000.0;
			}
		}
		else if(key == 'C')
		{
			cost += 10000;
		}
		else
		{
			cost += 20000;
		}

		return cost;
	}

	public String getCustomerName()
	{
		return customer;
	}

	public char getCategory()
	{
		return category;
	}

	public char getKey()
	{
		return key;
	}

	public double getCost()
	{
		return cost;
	}

}




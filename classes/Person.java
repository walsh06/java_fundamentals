public class Person
{
	String emailAddress, name;
	int age;

	public Person(String name, String emailAddress, int age)
	{
		this.name = name;
		this.emailAddress = emailAddress;
		this.age = age;
	}

	public String getEmailAddress()
	{
		return emailAddress;
	}

	public void setEmail(String email)
	{
		this.emailAdress = email;
	}

}
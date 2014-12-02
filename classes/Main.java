public class Main
{
	public static void main(String[] args)
	{
		Person p1 = new Person("Liam", "liam@email.com", 22);
		Person p2 = new Person("Cathal", "cathal@email.com", 21);

		string email = p1.getEmailAddress();

		p1.setEmail("hello@email.com");
		Email emailOne = new Email(p1, p2, "Hello cathal");

		emailOne.printEmail();
	}
}
public class Email
{
	private Person sender, receiver;
	private String message;
	public Email(Person sender, Person receiver, String message)
	{
		this.sender = sender;
		this.receiver = receiver;
		this.message = message;
	}

	public String getMessage()
	{
		return message;
	}

	public void printEmail()
	{
		System.out.println("Receiver: " + receiver.getEmailAddress() + " Sender: " + sender.getEmailAddress());
		System.out.println("Email: " + message);
	}

}
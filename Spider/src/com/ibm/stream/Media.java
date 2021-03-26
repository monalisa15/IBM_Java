package com.ibm.stream;

public class Media {
	
	protected String title;
	private String genre;
	private boolean free;
	
	public Media() {}

	public Media(String title, String genre, boolean free) {
		super();
		this.title = title;
		this.genre = genre;
		this.free = free;
	}
	public void play(User user) throws SubscriptionException , AgeRestrictionException
	{
		if(!free && user.getSubscription() == null)
			throw new SubscriptionException("You have not subscribed");
		else if(genre.equals("Erotic") && user.getAge() <18 || genre.equals("Horror") && user.getAge() >50)
			throw new AgeRestrictionException("You are not allowed to watch " + genre +" media");
		else
			System.out.println("Playing......"+title);
		
	}
	
	
}

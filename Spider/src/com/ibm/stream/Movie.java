package com.ibm.stream;

public class Movie extends Media {
	
	public Movie() {}
	
	public Movie(String title, String genre, boolean free)
	{
		super(title,genre,free);
	}

	@Override
	public void play(User user) throws SubscriptionException, AgeRestrictionException {
		// TODO Auto-generated method stub
		super.play(user);
		System.out.println("Playing :" +title);
	}
	

}

package com.ibm.stream;

public class Series extends Media {
	
	private int seasons;
	private int episodes;
	
	public Series() {}

	public Series(String title, String genre, boolean free,int seasons, int episodes) {
		super(title, genre, free);
		this.seasons = seasons;
		this.episodes = episodes;
	}

	@Override
	public void play(User user) throws SubscriptionException, AgeRestrictionException {
		super.play(user);
		System.out.println("Playing episode 01 of season 01");
	}
	
	public void play(User user,int seasons,int episodes) throws SubscriptionException, AgeRestrictionException
	{
		super.play(user);
		if(seasons < this.seasons && episodes <= this.episodes)
			System.out.println("Playing episode" + episodes +" of season " + seasons);
		else
			System.out.println("Cannt play requested media");
	}
	
	
	
	
	
	


}

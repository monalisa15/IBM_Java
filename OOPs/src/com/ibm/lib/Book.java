package com.ibm.lib;
public class Book {
    private int isbn;
    private String title;
    private Member member;
    
    public int getIsbn() {
		return isbn;
    }

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void status()
	{
	   if(member == null)
		   System.out.println(title +"is not issued to any member");
	   else
		   System.out.println(title +"is issued to"+ member.getName());
		   
	}
	
	public void issueBook(Member mbr) throws LibraryException
	{
		if(member != null)
		     throw new LibraryException(title+" is already issued");
		else if(mbr.getBook() != null)
			  throw new LibraryException(mbr.getName() +" has already issued a book");
		else
		{
			this.member = mbr;
			mbr.setBook(this);
		}
	}

	public void  returnBook(Member mbr)
	{
		if(member == null)
		 System.out.println(title +" is not issued to any member");
		else
		{
			this.member = null;
			mbr.setBook(null);
		}
	}
    public Book() {}
    public Book(int isbn,String title)
    {
    	this.isbn = isbn;
    	this.title = title;
    }


}

public class TestLibrary {
	public static void main(String[] args)
	{
		Book bk = new Book(101,"The AlChemist");
		Member mb = new Member(10,"Mona");
		bk.status();
		mb.status();
		bk.returnBook(mb);
		
		bk.issueBook(mb);
		
		bk.status();
		mb.status();
		
		bk.returnBook(mb);
		
	}

}

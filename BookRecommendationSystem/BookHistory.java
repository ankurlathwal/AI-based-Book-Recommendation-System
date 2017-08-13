import java.util.ArrayList;
public class BookHistory {

	private User user;
	private Book history;
	private String name;
	private int ISBN;
	private String genre;
	private int year;
	private String author;
	
	public BookHistory(){}

	public BookHistory(User user){
		this.user = user;
		
	}
	
	public void addBook(Book book){
		name = book.getName();
		ISBN = book.getISBN();
		author = book.getAuthor();
		year = book.getYear();
		genre = book.getGenre();
	}
	public Book getHistory(){
		return history;
	}
	public User getUser(){
		return user;
	}
	public String getName(){
		return name;
	}
	public String getAuthor(){
		return author;
	}
	public String getGenre(){
		return genre;
	}
	public int getISBN(){
		return ISBN;
	}
	public int getYear(){
		return year;
	}
}

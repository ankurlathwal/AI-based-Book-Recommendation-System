
public class RecommendedBook extends Book {
	private String name;
	private int ISBN;
	private String author;
	private int year;
	private String genre;
	public RecommendedBook(){}
	public RecommendedBook(String name,int ISBN,String author,int year,String Genre){
		this.name = name;
		this.ISBN = ISBN;
		this.author = author;
		this.year = year;
		this.genre = Genre;	
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


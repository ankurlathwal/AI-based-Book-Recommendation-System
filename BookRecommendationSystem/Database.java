import java.util.*;

public class Database {

	private ArrayList<User> users = new ArrayList<User>();
	private ArrayList<Book> books = new ArrayList<Book>();
	private ArrayList<BookHistory> bookhistory = new ArrayList<BookHistory>();
	
	User user1 = new User(100,100,"John Doe",20,Genre.Fantasy);
	User user2 = new User(101,101,"Mike Harris",40,Genre.NonFiction);
	User user3 = new User(102,102,"Peter White",27,Genre.Drama);
	User user4 = new User(103,103,"Roger Key",14,Genre.Children);
	User user5 = new User(104,104,"Ross Wayne",31,Genre.Romance);
	User user6 = new User(105,105,"Richard Brown",22,Genre.Horror);	
	
	Book book1 = new Book("Hamlet",1234560,"William Shakespeare",1602,Genre.Drama);
	Book book2 = new Book("Macbeth",1234561,"William Shakespeare",1606,Genre.Drama);
	Book book3 = new Book("Othello",1234562,"William Shakespeare",1603,Genre.Drama);
	Book book4 = new Book("Waiting for Godot",1234564,"Samuel Beckett",1952,Genre.Drama);
	Book book5 = new Book("Death of a Salesman",1234565,"Arthur Miller",1949,Genre.Drama);
	Book book6 = new Book("The Hitchhiker's Guide to the Galaxy",1234566,"Douglas Adams",1979,Genre.Comedy);
	Book book7 = new Book("Me Talk Pretty One Day",1234567,"David Sedaris",2000,Genre.Comedy);
	Book book8 = new Book("Yes Please",1234568,"Amy Poehler",2014,Genre.Comedy);
	Book book9 = new Book("Bridget Jones's Diary",1234569,"Helen Fielding",1999,Genre.Comedy);
	Book book10 = new Book("Bossy Pants",1234570,"Tina Fay",1979,Genre.Comedy);
	
	Book book11 = new Book("Charlie and the Chocolate Factory",1234571,"Roald Dahl",1964,Genre.Children);
	Book book12 = new Book("Winnie-the-Pooh",1234572,"AA Milne",1926,Genre.Children);
	Book book13 = new Book("Where the Wild Things Are",1234573,"Maurice Sendak",1963,Genre.Children);
	Book book14 = new Book("Charlotte’s Web",1234574,"EB White",1952,Genre.Children);
	Book book15 = new Book("Alice’s Adventures in Wonderland",1234575,"Lewis Carroll",1865,Genre.Children);
	
	Book book16 = new Book("Twilight",1234576,"Stephenie Meyer",2005,Genre.Romance);
	Book book17 = new Book("Pride and Prejudice",1234577,"Jane Austen",1813,Genre.Romance);
	Book book18 = new Book("The Fault in Our Stars",1234578,"John Green",2012,Genre.Romance);
	Book book19 = new Book("Romeo and Juliet",1234579,"William Shakespeare",1595,Genre.Romance);
	Book book20 = new Book("Me Before You",1234580,"Jojo Moyes",2012,Genre.Romance);
	
	Book book21 = new Book("The Shining",1234581,"Stephen King",1977,Genre.Horror);
	Book book22 = new Book("Dracula",1234582,"Bram Stoker",1897,Genre.Horror);
	Book book23 = new Book("It",1234583,"Stephen King",1986,Genre.Horror);
	Book book24 = new Book("Horns",1234584,"Joe Hill",2009,Genre.Horror);
	Book book25 = new Book("The Exorcist",1234585,"William Peter Blatty",1971,Genre.Horror);
	
	Book book26 = new Book("The Hobbit",1234586,"JRR Tolkein",1937,Genre.Fantasy);
	Book book27 = new Book("Harry Potter and the Deathly Hallows",1234587,"JK Rowling",2007,Genre.Fantasy);
	Book book28 = new Book("Harry Potter and the Half-Blood Prince",1234588,"JK Rowling",2005,Genre.Fantasy);
	Book book29 = new Book("A Game of Thrones",1234589,"George RR Martin",1996,Genre.Fantasy);
	Book book30 = new Book("The Hunger Games",1234590,"Suzanne Collins",2008,Genre.Fantasy);

	Book book31 = new Book("The Diary of a Young Girl",1234591,"Anne Frank",1942,Genre.NonFiction);
	Book book32 = new Book("Into the Wild",1234592,"Jon Krakauer",1996,Genre.NonFiction);
	Book book33 = new Book("Night",1234593,"Elie Wiesel",1958,Genre.NonFiction);
	Book book34 = new Book("Eat, Pray, Love",1234594,"Elizabeth Gilbert",2006,Genre.NonFiction);
	Book book35 = new Book("The Immortal Life of Henrietta Lacks",1234595,"Rebecca Skloot",2010,Genre.NonFiction);
	
	
	
	
	public void createUsers(){
	
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		users.add(user6);
		
	}
	
	public void createBooks(){
	
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		books.add(book6);
		books.add(book7);
		books.add(book8);
		books.add(book9);
		books.add(book10);
		books.add(book11);
		books.add(book12);
		books.add(book13);
		books.add(book14);
		books.add(book15);
		books.add(book16);
		books.add(book17);
		books.add(book18);
		books.add(book19);
		books.add(book20);
		books.add(book21);
		books.add(book22);
		books.add(book23);
		books.add(book24);
		books.add(book25);
		books.add(book26);
		books.add(book27);
		books.add(book28);
		books.add(book29);
		books.add(book30);
		books.add(book31);
		books.add(book32);
		books.add(book33);
		books.add(book34);
		books.add(book35);
	}
	
	public void createBookHistory(){
		BookHistory history1 = new BookHistory(user1);
		BookHistory history2 = new BookHistory(user2);
		BookHistory history3 = new BookHistory(user3);
		BookHistory history4 = new BookHistory(user4);
		BookHistory history5 = new BookHistory(user5);
		BookHistory history6 = new BookHistory(user6);
		
		history1.addBook(book1);
		history1.addBook(book13);
		history2.addBook(book11);
		history2.addBook(book19);
		history2.addBook(book10);
		history3.addBook(book12);
		history3.addBook(book13);
		history4.addBook(book23);
		history5.addBook(book29);
		history5.addBook(book27);
		history6.addBook(book31);
		history6.addBook(book33);	
		
		bookhistory.add(history1);
		bookhistory.add(history2);
		bookhistory.add(history3);
		bookhistory.add(history4);
		bookhistory.add(history5);
		bookhistory.add(history6);
		
		
	}
	
	public ArrayList<User> getUsers(){
		return users;
	}
	public ArrayList<Book> getBooks(){
		return books;
	}
/*	public ArrayList<Book> getHistory(User user){
		BookHistory bh;
		for(int i=0;i<bookhistory.size();i++){
			if(bookhistory.get(i).getUser().getID() == user.getID()){
				
			 bh = new BookHistory(bookhistory.get(i));
			}

		}
		return bh.getHistory();
	}*/
	
}

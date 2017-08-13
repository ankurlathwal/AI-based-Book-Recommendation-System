
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import jess.*;


public class BookRecommendationSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Database db = new Database();
		User user1 = new User(db.user1);
		User user2 = new User(db.user2);
		User user3 = new User(db.user3);
		User user4 = new User(db.user4);
		User user5 = new User(db.user5);
		User user6 = new User(db.user6);
		BookHistory his1 = new BookHistory(user1);
		his1.addBook(db.book21);
		BookHistory his2 = new BookHistory(user2);
		his2.addBook(db.book11);
		BookHistory his3 = new BookHistory(user3);
		his3.addBook(db.book29);
		BookHistory his4 = new BookHistory(user4);
		his4.addBook(db.book33);
		BookHistory his5 = new BookHistory(user5);
		his5.addBook(db.book3);
		BookHistory his6 = new BookHistory(user6);
		his6.addBook(db.book8);
		
/*		System.out.println(user1.getID() + "\n" + user1.getPassCode() + "\n" + user1.getName() + "\n" + user1.getAge() + "\n" + user1.getFavGenre() );
		System.out.println(book1.getName() + "\n" + book1.getISBN() + "\n" + book1.getAuthor() + "\n" + book1.getYear() + "\n" + book1.getGenre());
		for(int i=0;i<his1.getHistory().size();i++){
			System.out.println(his1.getHistory().get(i).getName());}*/
		
		try {
			Database database = new Database();
			RecommendationEngine engine = new RecommendationEngine(database);
			System.out.println("Welcome to our Online Store!\nPlease Identify your username.\n(Type your user number and Press Enter)\n--------------------------------------------------------------------------------------------");
			System.out.println("1. " + user1.getName());
			System.out.println("2. " + user2.getName());
			System.out.println("3. " + user3.getName());
			System.out.println("4. " + user4.getName());
			System.out.println("5. " + user5.getName());
			System.out.println("6. " + user6.getName());
			
		     Scanner sc = new Scanner(System.in);
		     int i = sc.nextInt();
		     if(i==1)
		    	 recommend(database,engine,user1,his1);
		     else if(i==2)
		    	 recommend(database,engine,user2,his2);
		     else if(i==3)
		    	 recommend(database,engine,user3,his3);
		     else if(i==4)
		    	 recommend(database,engine,user4,his4);
		     else if(i==5)
		    	 recommend(database,engine,user5,his5);
		     else
		    	 recommend(database,engine,user6,his6);
		     
			
			
			
		

		} catch (JessException e) {
			e.printStackTrace();
		}
			
	}
	private static void recommend (Database db,RecommendationEngine engine,User user,BookHistory bh) throws JessException{
		
		Iterator<RecommendedBook> books;
		books = engine.run(user,bh);
		System.out.println("-----------------------------------------------------------------------------------\n-----------------------------------------------------------------------------------");
		System.out.println("Hi " + user.getName() + "!");
		System.out.println("Your Profile: \nName: " + user.getName() + "\nAge: " + user.getAge() + "\nFavorite Genre: " + user.getFavGenre());
		System.out.println("Your recent Book Purchase: \n" + bh.getName() + ", ISBN: " + bh.getISBN() + ", Author: " + bh.getAuthor() + ", Year: " + bh.getYear() + ", Genre: " + bh.getGenre());
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Based on your profile, favorite genre and recent history, here are some book recommendations for you:");
		while(books.hasNext()){
			Book tempbook = new Book(books.next());
			System.out.println(tempbook.getName() + ", ISBN: "+tempbook.getISBN()+", Author: "+tempbook.getAuthor()+", Year: "+tempbook.getYear()+", Genre: "+ tempbook.getGenre());
		}
		
		
	}
}

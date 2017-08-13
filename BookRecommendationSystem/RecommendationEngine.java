
import java.util.Iterator;

import jess.*;


public class RecommendationEngine {

	private Rete engine;
	private WorkingMemoryMarker marker;
	private Database database;
	
	public RecommendationEngine(Database database) throws JessException{
		
		engine = new Rete();
		engine.reset();
		engine.batch("Recommendation.clp");
		this.database = database;
		database.createUsers();
		database.createBooks();
		database.createBookHistory();
	    for(int i=0;i<database.getBooks().size();i++){
	    	engine.add(database.getBooks().get(i));
	    }
	//	engine.add(database.book1);
		marker = engine.mark();
		
	}
	
	public void loadUser(User user) throws JessException{
		
				engine.add(user);

	}
	
	public void loadHistory(BookHistory bh) throws JessException{
		
		engine.add(bh);

}

	 public Iterator<RecommendedBook> run(User user,BookHistory bh) throws JessException {   // iterator
	    	engine.resetToMark(marker);
	    	
	        loadUser(user);
	        loadHistory(bh);
	        engine.run();
	        
	        return engine.getObjects(new Filter.ByClass(RecommendedBook.class));
	    }
}


public class User {
	
	
	private int id;
	private int passcode;
	private String name;
	private int age;
	private String favGenre;
	
	public User(User user){
		this.id = user.getID();
		this.passcode = user.getPassCode();
		this.name = user.getName();
		this.age = user.getAge();
		this.favGenre = user.getFavGenre();
	}
	public User(int id, int passcode, String name, int age, String favGenre) {
		this.id = id;
		this.passcode = passcode;
		this.name = name;
		this.age = age;
		this.favGenre = favGenre;
	}
	
	public int getID (){
		return id;
	}
	
	public int getPassCode(){
		return passcode;
		
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	public String getFavGenre(){
		return favGenre;
	}
	
	
	
	
}


public class Duck {
		String favoriteFood;
		int numberOfFriends;
		String name;
		
	public Duck(String name, String favoriteFood, int numberOfFriends) {
		this.name = name;
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
		
	}
	
	void Quack() {
		System.out.println(name +" likes to eat " + favoriteFood);
		System.out.println(name + " has " + numberOfFriends + " Friends");
		
	}
	
}






	

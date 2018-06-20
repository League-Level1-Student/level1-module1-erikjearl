
public class TacoRunner {

	
	public static void main (String[] args) {
		Taco t = new Taco("beef", "red");
		
		
		
		System.out.println( t.getMeat() + " " + t.getSauce() );
		
		t.setMeat("chicken");
		t.setSauce("mushroom");
		
		System.out.println( t.getMeat() + " " + t.getSauce() );
		
		
		
		
		
	}
}


public class SmurfRunenr {
	
	public static void main(String[] args) {
		Smurf s = new Smurf("Jon");
		
		s.eat();
		System.out.println( s.getName() );
		System.out.println("My hat is " + s.getHatColor());
		System.out.println("I am a " +s.isGirlOrBoy());
		
		
		Smurf p = new Smurf ("Papa");
		p.eat();
		System.out.println( p.getName() );
		
		
		String name = p.getName();
		
		
		System.out.println("My hat is " + p.getHatColor());
		System.out.println("I am a " +p.isGirlOrBoy());
		
		
		
		Smurf s1 = new Smurf("Smurfette");
		
		s1.eat();
		String names1 = s1.getName();
		
		System.out.println(names1);
		System.out.println("My hat is " + s1.getHatColor());
		System.out.println("I am a " +s1.isGirlOrBoy());

	
	}
	
	
}

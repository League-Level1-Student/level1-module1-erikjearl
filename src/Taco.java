
public class Taco {

	private String meat;
	private String sauce;

		public Taco(String meat, String sauce) {
			
		this.meat = meat;
		this.sauce = sauce;
			
		}

		
		public String getMeat(){
			
			return meat;
			
		}
		
		public String getSauce() {
			return sauce;
		}

		
		public void setSauce(String sauce) {
			this.sauce = sauce;
		}
		
		public void setMeat(String meat) {
			this.meat = meat;
		}

		
}
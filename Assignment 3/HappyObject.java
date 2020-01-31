public class HappyObject extends MoodyObject{
		
	//returns a string indicating happy
	protected String getMood() {
		return "happy";
	}
	//print laughter string
	public void expressFeelings() {
		System.out.println("hehehehe.....hahaha...HAHAHAHA");
	}
	
	//returns message about self
	public String toString() {
		return "Subject laughs a lot";
	}
}
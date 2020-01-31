public class SadObject extends MoodyObject{
	//returns a string indicating happy
	protected String getMood() {
		return "sad";
	}
	//print sad string
	public void expressFeelings() {
		System.out.println("'wah' 'boo hoo' 'weep' 'sob' 'weep'");
	}
	
	//returns message about self
	public String toString() {
		return "Subject cries a lot";
	}
}

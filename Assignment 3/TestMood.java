
public class TestMood {
	public static void main(String[] args) {
		PsychiatristObject psy = new PsychiatristObject();
		MoodyObject happyMood = new HappyObject();
		MoodyObject sadMood = new SadObject();
		
		psy.examine(happyMood);
		psy.observe(happyMood);
		
		psy.examine(sadMood);
		psy.observe(sadMood);
	}
}

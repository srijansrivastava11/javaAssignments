public abstract class MoodyObject {

	//return the mood sad or happy-depending on which object sends the message
	protected abstract String getMood();
	
	//each object expresses a different emotion
	protected abstract void expressFeelings();
	
	//ask the object how it feels
	public void queryMood(){
		System.out.println("I feel " + getMood() + " today!\n");
	}
}

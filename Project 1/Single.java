
public class Single implements IVoteService{
private int Answer[];
	public Single() {
		Answer = new int[2];
	}
	public void Vote(int vote) {
		//Right = 0, Wrong = 1
		Answer[vote]++;
	}
	public String Print() {
		String temp = "Right: " + Answer[0] + " Wrong: "+ Answer[1];
		return temp;
	}
}


public class Multiple implements IVoteService{
private int Answer[];
	public Multiple() {
		Answer = new int[4];
	}
	public void Vote(int vote) {
		//A = 0, B = 1, C = 2, D = 3
		Answer[vote]++;
	}
	public String Print() {
		String temp = "A: " + Answer[0] + " B: " + Answer[1] + " C: " + Answer[2] + " D: " + Answer[3];
		return temp;
	}
}

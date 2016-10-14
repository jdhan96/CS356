
public class SimulationDriver {
	public static void main(String args[]) {
		Student numofStudent[] = new Student[(int)(Math.random()*30)];
		int typeofQuestion= (int) (Math.random()*2);
		
		Question type = new Question(typeofQuestion);
		
		IVoteService service;
		if(type.getQuestionType() == 0){
			service = new Multiple();
		} else {
			service = new Single();
		}
		
		for(int i = 0; i < numofStudent.length; i++) {
			numofStudent[i] = new Student(Integer.toString(i));
			if(type.getQuestionType() == 0) {
				numofStudent[i].setAnswer((int)(Math.random()*4));
				service.Vote(numofStudent[i].getAnswer());
			} else {
				numofStudent[i].setAnswer((int)(Math.random()*2));
				service.Vote(numofStudent[i].getAnswer());
			}
		}
		System.out.println("CS 356 IVote.io");
		System.out.println(service.Print());
		
	}
}


public class Question {
	public int QuestionType;
	public Question(int QuestionType) {
		//if questiontype = 0 then its multiple choice else if its 1 then its single choice
		this.QuestionType = QuestionType;
	}
	public int getQuestionType() {
		return QuestionType;
	}
}

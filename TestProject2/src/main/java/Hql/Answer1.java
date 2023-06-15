package Hql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Answer1 {

	@Id
	@Column(name="answer_id")
	private int answerId;
	private String answer;
	
	
	@ManyToOne
	private Question1 question;


	public int getAnswerId() {
		return answerId;
	}


	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public Question1 getQuestion() {
		return question;
	}


	public void setQuestion(Question1 question) {
		this.question = question;
	}


	public Answer1() {
	}


	@Override
	public String toString() {
		return "Answer1 [answerId=" + answerId + ", answer=" + answer + ", question=" + question + "]";
	}
	


}

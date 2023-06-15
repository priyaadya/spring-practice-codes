package Hql;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Question1 {
	
		@Id
		@Column(name="question_id")
		private int questionId;
		private String question;
		
		@OneToMany(mappedBy = "question")
		private List<Answer1> answer;

		public int getQuestionId() {
			return questionId;
		}

		public void setQuestionId(int questionId) {
			this.questionId = questionId;
		}

		public String getQuestion() {
			return question;
		}

		public void setQuestion(String question) {
			this.question = question;
		}

		public List<Answer1> getAnswer() {
			return answer;
		}

		public void setAnswer(List<Answer1> answer) {
			this.answer = answer;
		}

		public Question1() {
			
		}

		@Override
		public String toString() {
			return "Question1 [questionId=" + questionId + ", question=" + question + ", answer=" + answer + "]";
		}


		

	}




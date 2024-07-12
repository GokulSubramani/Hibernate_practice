package Hb;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "Answer")
public class Answer {
	
	private String ans_id,ans,posted_by;
	private List<Question>question;
	
	@Id
	@Column(name = "Ans_id",length=30)
	public String getAns_id() {
		return ans_id;
	}
	public void setAns_id(String ans_id) {
		this.ans_id = ans_id;
	}
	
	@Column(name = "Ans",length=70)
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	
	@Column(name = "posted_by",length=100)
	public String getPosted_by() {
		return posted_by;
	}
	public void setPosted_by(String posted_by) {
		this.posted_by = posted_by;
	}
	
	@OneToMany(targetEntity = Question.class,cascade = CascadeType.ALL)
	
	public List<Question> getQuestion() {
		return question;
	}
	public void setQuestion(List<Question> question) {
		this.question = question;
	}
	
	
	
}

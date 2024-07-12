package Hb;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "Questions")
public class Question {
	

	@Id
	@Column(name = "ques_id",length = 30)
	private String ques_id;

	@Column(name = "ques",length = 50)
	private String ques;
	

	@ManyToMany(targetEntity = Answer.class)
	@JoinTable(name = "Ques&Ans",joinColumns = {@JoinColumn(name="Ans_id")},
	inverseJoinColumns = {@JoinColumn(name="ques_id")})
	private List<Answer>answer;
	
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	public String getQues_id() {
		return ques_id;
	}
	public void setQues_id(String ques_id) {
		this.ques_id = ques_id;
	}
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	
	
	
}

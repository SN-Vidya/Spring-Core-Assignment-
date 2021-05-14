package com.questionanswer;

import java.util.Iterator;  
import java.util.Map;  
import java.util.Set;  
import java.util.Map.Entry;  
  
public class Question {  
private int questionid;  
private String question;  
private Map<String,String> answers;  
  
  
  
public int getQuestionid() {
	return questionid;
}



public void setQuestionid(int questionid) {
	this.questionid = questionid;
}



public String getQuestion() {
	return question;
}



public void setQuestion(String question) {
	this.question = question;
}



public Map<String, String> getAnswers() {
	return answers;
}



public void setAnswers(Map<String, String> answers) {
	this.answers = answers;
}



public void displayInfo(){  
    System.out.println("questionid:"+questionid);  
    System.out.println("question :"+question);  
    System.out.println("Answers....");  
    Set<Entry<String, String>> set=answers.entrySet();  
    Iterator<Entry<String, String>> itr=set.iterator();  
    while(itr.hasNext()){  
        Entry<String,String> entry=itr.next();  
        System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());  
    }  
}  
}  

/*
 * import java.util.List; import java.util.Set; import java.util.Iterator;
 * 
 * public class Question { private int questionId; private String question;
 * private Set<String>answer; public int getQuestionId() { return questionId; }
 * public void setQuestionId(int questionId) { this.questionId = questionId; }
 * public String getQuestion() { return question; } public void
 * setQuestion(String question) { this.question = question; } public Set<String>
 * getAnswer() { return answer; } public void setAnswer(Set<String> answer) {
 * this.answer = answer; }
 * 
 * public void displayInfo() { System.out.println(questionId+""+question);
 * System.out.println("answer are:"); Iterator<String>itr=answer.iterator();
 * while(itr.hasNext()) { System.out.println(itr.next()); }
 * 
 * 
 * 
 * }
 * 
 * }
 */
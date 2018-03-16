/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Hansel castro
 */
public class QuestionScene extends Scene implements Serializable {
    private String answer;
    private String question;
    private Integer questionNumber;
    private String status;

    public QuestionScene() {
    }
    
    

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Integer getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(Integer questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.answer);
        hash = 43 * hash + Objects.hashCode(this.question);
        hash = 43 * hash + Objects.hashCode(this.questionNumber);
        hash = 43 * hash + Objects.hashCode(this.status);
        return hash;
    }

    @Override
    public String toString() {
        return "QuestionScene1{" + "answer=" + answer + ", question=" + question + ", questionNumber=" + questionNumber + ", status=" + status + '}';
    }
    
         
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final QuestionScene other = (QuestionScene) obj;
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.questionNumber, other.questionNumber)) {
            return false;
        }
        return true;
    }
    
    
    
}

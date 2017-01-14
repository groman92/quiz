package com.lasalle.first.part.quiz.model;

import java.util.List;

public class Question {

    private String theQuestion;
    private List<Answer> answersList;

    public Question(String theQuestion, List<Answer> answersList) {
        this.theQuestion = theQuestion;
        this.answersList = answersList;
    }

    public String getTheQuestion() {
        return theQuestion;
    }

    public void setTheQuestion(String theQuestion) {
        this.theQuestion = theQuestion;
    }

    public List<Answer> getAnswersList() {
        return answersList;
    }

    public boolean getAnswerResult (int answerIndex) { return answersList.get(answerIndex).isRight();}

    public void setAnswersList(List<Answer> answersList) {
        this.answersList = answersList;
    }
}

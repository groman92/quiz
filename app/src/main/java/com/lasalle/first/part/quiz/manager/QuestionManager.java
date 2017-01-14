package com.lasalle.first.part.quiz.manager;


import com.lasalle.first.part.quiz.data.imp.QuestionDataMock;
import com.lasalle.first.part.quiz.model.Question;

public class QuestionManager {

    private QuestionDataMock questionData;
    private int correctQuestions;
    private int wrongQuestions;


    public QuestionManager (){
        questionData = new QuestionDataMock();
        setCorrectQuestions(0);
        setWrongQuestions(0);
    }

    public Question getNextQuestion(int currentQuestion){ return questionData.getQuestion(currentQuestion); }

    public int countQuestions(){ return questionData.countQuestions(); }

    public boolean checkQuestion(int currentQuestion, int answerIndex){

        return questionData.checkAnswer(currentQuestion,answerIndex);

    }

    public void youAreRight(){
        this.correctQuestions++;
    }

    public void youAreWrong(){
        this.wrongQuestions++;
    }

    public int getCorrectQuestions() {
        return correctQuestions;
    }

    public void setCorrectQuestions(int correctQuestions) {
        this.correctQuestions = correctQuestions;
    }

    public int getWrongQuestions() {
        return wrongQuestions;
    }

    public void setWrongQuestions(int wrongQuestions) {
        this.wrongQuestions = wrongQuestions;
    }
}

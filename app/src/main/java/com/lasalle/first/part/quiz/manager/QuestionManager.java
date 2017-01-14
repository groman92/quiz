package com.lasalle.first.part.quiz.manager;


import com.lasalle.first.part.quiz.data.imp.QuestionDataMock;
import com.lasalle.first.part.quiz.model.Question;

public class QuestionManager {

    private QuestionDataMock questionData;

    public QuestionManager (){
        questionData = new QuestionDataMock();
    }

    public Question getNextQuestion(int currentQuestion){ return questionData.getQuestion(currentQuestion); }

    public int countQuestions(){ return questionData.countQuestions(); }

    public boolean checkQuestion(int currentQuestion, int answerIndex){

        return questionData.checkAnswer(currentQuestion,answerIndex);

    }


}

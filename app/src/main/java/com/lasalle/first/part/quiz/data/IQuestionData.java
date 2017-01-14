package com.lasalle.first.part.quiz.data;

import com.lasalle.first.part.quiz.model.Question;

public interface IQuestionData {
    public Question getQuestion(int questionId);
    public Integer countQuestions();
}

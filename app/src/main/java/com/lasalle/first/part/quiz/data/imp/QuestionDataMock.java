package com.lasalle.first.part.quiz.data.imp;

import com.lasalle.first.part.quiz.data.IQuestionData;
import com.lasalle.first.part.quiz.model.Question;
import com.lasalle.first.part.quiz.model.Answer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionDataMock implements IQuestionData {

    private List<Question> questionList;

    public QuestionDataMock() {

        questionList = new ArrayList<>();

        questionList.add(new Question(
                "Who won the 2014 World Cup?",
                Arrays.asList(
                        new Answer("Argentina", true),
                        new Answer("Brazil", false),
                        new Answer("Spain", false),
                        new Answer("Germany", false)
                )
        ));

        questionList.add(new Question(
                "Who won the 2016 LOL Worlds?",
                Arrays.asList(
                        new Answer("SKT", true),
                        new Answer("Fnatic", false),
                        new Answer("EDG", false),
                        new Answer("Origen", false)
                )
        ));

        questionList.add(new Question(
                "2+2",
                Arrays.asList(
                        new Answer("1", true),
                        new Answer("2", false),
                        new Answer("3", false),
                        new Answer("4", false)
                )
        ));

        questionList.add(new Question(
                "0+1",
                Arrays.asList(
                        new Answer("1", true),
                        new Answer("2", false),
                        new Answer("4", false),
                        new Answer("3", false)
                )
        ));

        questionList.add(new Question(
                "Who won the 2016 LOL Worlds?",
                Arrays.asList(
                        new Answer("SKT", true),
                        new Answer("Fnatic", false),
                        new Answer("EDG", false),
                        new Answer("Origen", false)
                )
        ));
    }

    public List<Question> getQuestionList()
    {
        return questionList;
    }

    public Question getCurrentQuestion(int currentQuestion)
    {
        return questionList.get(currentQuestion);
    }


    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    @Override
    public Question getQuestion(int questionId) {
        return questionList.get(questionId);
    }

    @Override
    public Integer countQuestions() {
        return questionList.size();
    }

    public boolean checkAnswer(int currentQuestion, int answerIndex) {

        return questionList.get(currentQuestion).getAnswerResult(answerIndex);
    }
}

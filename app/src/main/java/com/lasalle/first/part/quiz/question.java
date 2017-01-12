package com.lasalle.first.part.quiz;

import java.util.ArrayList;

/**
 * Created by gerardromansolanas on 10/1/17.
 */

public class Question {

    private ArrayList<String> answers;
    private String theQuestion;
    //indexOf the solution
    private String solution;


    public Question() {
        answers = new ArrayList<>();
        theQuestion = new String();
        solution = new String();
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public String getIndividualAnswer(int index){
        return answers.get(index);
    }

    public String getTheQuestion() {
        return theQuestion;
    }

    public void setTheQuestion(String theQuestion) {
        this.theQuestion = theQuestion;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public void addAnswer(String ans){
        answers.add(ans);
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }
}

package com.lasalle.first.part.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;


public class quizQuestions extends AppCompatActivity implements View.OnClickListener {


    private int successQuestion;
    private int currentQuestion;
    private int totalQuestion;
    private int userSolution;
    private question[] questions;
    private Button checkQuestion;
    private RadioButton[] rbQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_questions);

        rbQuestions = new RadioButton[4];
        questions = new question[5];
        checkQuestion = (Button)findViewById(R.id.checkButton);

        initVariables(questions,checkQuestion,rbQuestions);
    }

    private void initVariables(question[] q, Button checkQuestions, RadioButton[] rbQuestionsa) {

        setSuccessQuestion(0);
        setTotalQuestion(0);
        setCurrentQuestion(0);

        initQuestions(q);
        initrButtonQuestion(rbQuestionsa);

        checkQuestions.setOnClickListener(this);

    }

    private void initrButtonQuestion(RadioButton[] rbQuestionsa) {

        rbQuestionsa[0] = (RadioButton)findViewById(R.id.questionOne);
        rbQuestionsa[1] = (RadioButton)findViewById(R.id.questionTwo);
        rbQuestionsa[2] = (RadioButton)findViewById(R.id.questionThree);
        rbQuestionsa[3] = (RadioButton)findViewById(R.id.questionFour);

        for (int i=0; i<rbQuestionsa.length; i++){
            rbQuestionsa[i].setOnClickListener(this);
        }

        rbQuestionsa[0].setText(questions[0].getIndividualAnswer(0));
        rbQuestionsa[1].setText(questions[0].getIndividualAnswer(1));
        rbQuestionsa[2].setText(questions[0].getIndividualAnswer(2));
        rbQuestionsa[3].setText(questions[0].getIndividualAnswer(3));


    }

    private void initQuestions(question[] q) {
        q[0] = new question();
        q[0].setTheQuestion("1+1");
        q[0].addAnswer("1");
        q[0].addAnswer("2");
        q[0].addAnswer("3");
        q[0].addAnswer("4");
        q[0].setSolution("2");

        q[1] = new question();
        q[1].setTheQuestion("2+2");
        q[1].addAnswer("1");
        q[1].addAnswer("2");
        q[1].addAnswer("3");
        q[1].addAnswer("4");
        q[1].setSolution("4");

        q[2] = new question();
        q[2].setTheQuestion("3+3");
        q[2].addAnswer("1");
        q[2].addAnswer("2");
        q[2].addAnswer("6");
        q[2].addAnswer("4");
        q[2].setSolution("6");

        q[3] = new question();
        q[3].setTheQuestion("4+4");
        q[3].addAnswer("1");
        q[3].addAnswer("8");
        q[3].addAnswer("3");
        q[3].addAnswer("4");
        q[3].setSolution("8");

        q[4] = new question();
        q[4].setTheQuestion("5+5");
        q[4].addAnswer("1");
        q[4].addAnswer("2");
        q[4].addAnswer("10");
        q[4].addAnswer("4");
        q[4].setSolution("10");

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.checkButton:

                //System.out.println(questions[0].getSolution());
                if (questions[getCurrentQuestion()].getSolution() == rbQuestions[getUserSolution()].getText())
                {
                    setSuccessQuestion(getSuccessQuestion()+1);
                    System.out.println("Pentakill");

                    
                }

                setCurrentQuestion(getCurrentQuestion()+1);

                break;
            case R.id.questionOne:
                setUserSolution(0);

                break;

            case R.id.questionTwo:
                setUserSolution(1);
                break;

            case R.id.questionThree:
                setUserSolution(2);
                break;

            case R.id.questionFour:
                setUserSolution(3);
                break;

            default:

                break;
        }
    }

    public int getCurrentQuestion() {
        return currentQuestion;
    }

    public void setCurrentQuestion(int currentQuestion) {
        this.currentQuestion = currentQuestion;
    }

    public int getSuccessQuestion() {
        return successQuestion;
    }

    public void setSuccessQuestion(int succesQuestion) {
        this.successQuestion = succesQuestion;
    }

    public int getTotalQuestion() {
        return totalQuestion;
    }

    public void setTotalQuestion(int totalQuestion) {
        this.totalQuestion = totalQuestion;
    }

    public int getUserSolution() {
        return userSolution;
    }

    public void setUserSolution(int userSolution) {
        this.userSolution = userSolution;
    }
}

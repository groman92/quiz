package com.lasalle.first.part.quiz.activity;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.lasalle.first.part.quiz.R;
import com.lasalle.first.part.quiz.manager.QuestionManager;
import com.lasalle.first.part.quiz.model.Answer;
import com.lasalle.first.part.quiz.model.Question;

import java.util.ArrayList;
import java.util.List;


public class QuizQuestions extends AppCompatActivity implements View.OnClickListener {


    private int currentQuestion;

    //BUTTONS
    private Button checkQuestion;
    private List<RadioButton> rbQuestions;
    //RADIOGROUP
    private RadioGroup rgQuestion;
    //DATA
    private List<Question> questions;
    //MANAGER
    private QuestionManager questionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_questions);



        setCurrentQuestion(0);
        rbQuestions = new ArrayList<>();


        //BUTTONS
        checkQuestion = (Button) findViewById(R.id.checkButton);

        rbQuestions.add((RadioButton) findViewById(R.id.questionOne));
        rbQuestions.add((RadioButton) findViewById(R.id.questionTwo));
        rbQuestions.add((RadioButton) findViewById(R.id.questionThree));
        rbQuestions.add((RadioButton) findViewById(R.id.questionFour));

        checkQuestion = (Button)findViewById(R.id.checkButton);
        checkQuestion.setOnClickListener(this);

        rgQuestion = (RadioGroup) findViewById(R.id.rgQuestion);

        questionManager = new QuestionManager();

        formatTitle();
        formatQuestion();
    }

    public void formatTitle(){
        Resources res = getResources();
        String text = String.format(
                res.getString(R.string.current_question),
                currentQuestion + 1,
                questionManager.countQuestions());
        TextView textView = (TextView) findViewById(R.id.questionBreadCrumb);
        textView.setText(text);
    }

    public void formatQuestion(){
        Question question = questionManager.getNextQuestion(getCurrentQuestion());

        TextView textView = (TextView) findViewById(R.id.questionTitle);
        textView.setText(question.getTheQuestion());

        int answerIndex = 0;
        for(Answer answer : question.getAnswersList())
        {
            rbQuestions.get(answerIndex).setText(answer.getText());
            answerIndex++;
        }
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.checkButton:
                System.out.println("CheckButton");
                View radioButton = rgQuestion.findViewById(rgQuestion.getCheckedRadioButtonId());

                int indexResposta = rgQuestion.indexOfChild(radioButton);

                if (questionManager.checkQuestion(getCurrentQuestion(),indexResposta)){
                    System.out.println("Acertaste");
                }else{
                    System.out.println("Te bañaste");
                }

                break;

            default:
                System.out.println("NonSense Button");
                break;
        }
    }


    public int getCurrentQuestion() {
        return currentQuestion;
    }

    public void setCurrentQuestion(int currentQuestion) {
        this.currentQuestion = currentQuestion;
    }
}

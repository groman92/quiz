package com.lasalle.first.part.quiz.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lasalle.first.part.quiz.R;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        formatTitle();

        Button startQuiz = (Button) findViewById(R.id.StartQuiz);

        startQuiz.setOnClickListener(this);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Intent intent = new Intent(
                getApplicationContext(),
                MainActivity.class);

        startActivity(intent);
    }

    public void formatTitle(){
        //String data= getIntent().getStringExtra("keyName");
        Resources res = getResources();

        String totalQ = String.format(res.getString(R.string.totalQuestions),
                getIntent().getIntExtra("Total",0)
        );

        TextView textView = (TextView) findViewById(R.id.totalQuestions);
        textView.setText(totalQ);

        String totalCorrect = String.format("%1$d",
                getIntent().getIntExtra("Correct",0)
        );

        TextView textViewCorrect = (TextView) findViewById(R.id.totalCorrect);
        textViewCorrect.setText(totalCorrect);

        String totalWrong = String.format("%1$d",
                getIntent().getIntExtra("Incorrect",0)
        );

        TextView textViewWrong = (TextView) findViewById(R.id.totalIncorrect);
        textViewWrong.setText(totalWrong);


    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(
                getApplicationContext(),
                MainActivity.class);

        startActivity(intent);
    }
}

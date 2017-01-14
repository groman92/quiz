package com.lasalle.first.part.quiz.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.lasalle.first.part.quiz.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button initialButton = (Button)findViewById(R.id.initialButton);

        initialButton.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId())
        {
            case R.id.initialButton:

                Intent intent = new Intent(
                        getApplicationContext(),
                        ResultActivity.class);

                startActivity(intent);
                break;

            default:

                break;
        }
    }
}

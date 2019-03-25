package com.example.logica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button mSubmit;
    private TextView mAnswer1;
    private TextView mAnswer2;
    private TextView mAnswer3;
    private TextView mAnswer4;
    private TextView mHeader;
    private int value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSubmit = findViewById(R.id.buttonSubmit);
        mAnswer1 = findViewById(R.id.editText1);
        mAnswer2 = findViewById(R.id.editText2);
        mAnswer3 = findViewById(R.id.editText3);
        mAnswer4 = findViewById(R.id.editText4);
        mHeader = findViewById(R.id.textViewCase);

        changeQuiz();

        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswers(mAnswer1.getText().toString(), mAnswer2.getText().toString(), mAnswer3.getText().toString(), mAnswer4.getText().toString());
            }
        });
    }

    private void changeQuiz() {
        value = new Random().nextInt(3) + 1;
        switch (value){
            case 1:
                mHeader.setText(getString(R.string.conjunction));
                break;
            case 2:
                mHeader.setText(getString(R.string.Disjunction));
                break;
            case 3:
                mHeader.setText(getString(R.string.Conditional));
                break;
        }
    }

    private void checkAnswers(String answer1, String answer2, String answer3, String answer4){
        switch (value){
            case 1:
                if (TextUtils.isEmpty(answer1) || TextUtils.isEmpty(answer2) || TextUtils.isEmpty(answer3) || TextUtils.isEmpty(answer4)){
                    Toast.makeText(this, "Please fill in all the answers", Toast.LENGTH_SHORT).show();
                } else if (answer1.equals("T") && answer2.equals("F") && answer3.equals("F") && answer4.equals("F")){
                    Toast.makeText(this, "All the answers are correct", Toast.LENGTH_SHORT).show();
                    clearFields();
                    changeQuiz();
                } else {
                    Toast.makeText(this, "Try again", Toast.LENGTH_SHORT).show();
                    clearFields();
                }
                break;
            case 2:
                if (TextUtils.isEmpty(answer1) || TextUtils.isEmpty(answer2) || TextUtils.isEmpty(answer3) || TextUtils.isEmpty(answer4)){
                    Toast.makeText(this, "Please fill in all the answers", Toast.LENGTH_SHORT).show();
                } else if (answer1.equals("T") && answer2.equals("T") && answer3.equals("T") && answer4.equals("F")){
                    Toast.makeText(this, "All the answers are correct", Toast.LENGTH_SHORT).show();
                    clearFields();
                    changeQuiz();
                } else {
                    Toast.makeText(this, "Try again", Toast.LENGTH_SHORT).show();
                    clearFields();
                }
                break;
            case 3:
                if (TextUtils.isEmpty(answer1) || TextUtils.isEmpty(answer2) || TextUtils.isEmpty(answer3) || TextUtils.isEmpty(answer4)){
                    Toast.makeText(this, "Please fill in all the answers", Toast.LENGTH_SHORT).show();
                } else if (answer1.equals("T") && answer2.equals("F") && answer3.equals("T") && answer4.equals("T")){
                    Toast.makeText(this, "All the answers are correct", Toast.LENGTH_SHORT).show();
                    clearFields();
                    changeQuiz();
                } else {
                    Toast.makeText(this, "Try again", Toast.LENGTH_SHORT).show();
                    clearFields();
                }
                break;
        }
    }

    public void clearFields(){
        mAnswer1.setText("");
        mAnswer2.setText("");
        mAnswer3.setText("");
        mAnswer4.setText("");
    }
}

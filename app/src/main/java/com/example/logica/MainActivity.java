package com.example.logica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
                checkAnswers();
                clearFields();
                changeQuiz();
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

    private void checkAnswers(){
        switch (value){
            case 1:
                if (mAnswer1.getText() == "T") {
                    Toast.makeText(this, "Answer one is correct", Toast.LENGTH_SHORT).show();
                } else if (mAnswer1.getText() == "F") {
                    Toast.makeText(this, "Answer one is wrong", Toast.LENGTH_SHORT).show();
                } else if (mAnswer2.getText() == "F") {
                    Toast.makeText(this, "Answer two is correct", Toast.LENGTH_SHORT).show();
                } else if (mAnswer2.getText() == "T") {
                    Toast.makeText(this, "Answer two is wrong", Toast.LENGTH_SHORT).show();
                } else if (mAnswer3.getText() == "F") {
                    Toast.makeText(this, "Answer three is correct", Toast.LENGTH_SHORT).show();
                } else if (mAnswer3.getText() == "T") {
                    Toast.makeText(this, "Answer three is wrong", Toast.LENGTH_SHORT).show();
                } else if (mAnswer4.getText() == "F") {
                    Toast.makeText(this, "Answer four is correct", Toast.LENGTH_SHORT).show();
                } else if (mAnswer4.getText() == "T") {
                    Toast.makeText(this, "Answer four is wrong", Toast.LENGTH_SHORT).show();
                }
                break;
            case 2:
                if (mAnswer1.getText() == "T") {
                    Toast.makeText(this, "Answer one is correct", Toast.LENGTH_SHORT).show();
                } else if (mAnswer1.getText() == "F") {
                    Toast.makeText(this, "Answer one is wrong", Toast.LENGTH_SHORT).show();
                } else if (mAnswer2.getText() == "T") {
                    Toast.makeText(this, "Answer two is correct", Toast.LENGTH_SHORT).show();
                } else if (mAnswer2.getText() == "F") {
                    Toast.makeText(this, "Answer two is wrong", Toast.LENGTH_SHORT).show();
                } else if (mAnswer3.getText() == "T") {
                    Toast.makeText(this, "Answer three is correct", Toast.LENGTH_SHORT).show();
                } else if (mAnswer3.getText() == "F") {
                    Toast.makeText(this, "Answer three is wrong", Toast.LENGTH_SHORT).show();
                } else if (mAnswer4.getText() == "F") {
                    Toast.makeText(this, "Answer four is correct", Toast.LENGTH_SHORT).show();
                } else if (mAnswer4.getText() == "T") {
                    Toast.makeText(this, "Answer four is wrong", Toast.LENGTH_SHORT).show();
                }
                break;
            case 3:
                if (mAnswer1.getText() == "T") {
                    Toast.makeText(this, "Answer one is correct", Toast.LENGTH_SHORT).show();
                } else if (mAnswer1.getText() == "F") {
                    Toast.makeText(this, "Answer one is wrong", Toast.LENGTH_SHORT).show();
                } else if (mAnswer2.getText() == "F") {
                    Toast.makeText(this, "Answer two is correct", Toast.LENGTH_SHORT).show();
                } else if (mAnswer2.getText() == "T") {
                    Toast.makeText(this, "Answer two is wrong", Toast.LENGTH_SHORT).show();
                } else if (mAnswer3.getText() == "T") {
                    Toast.makeText(this, "Answer three is correct", Toast.LENGTH_SHORT).show();
                } else if (mAnswer3.getText() == "F") {
                    Toast.makeText(this, "Answer three is wrong", Toast.LENGTH_SHORT).show();
                } else if (mAnswer4.getText() == "T") {
                    Toast.makeText(this, "Answer four is correct", Toast.LENGTH_SHORT).show();
                } else if (mAnswer4.getText() == "F") {
                    Toast.makeText(this, "Answer four is wrong", Toast.LENGTH_SHORT).show();
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

package com.romandurran.testyesno;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button yesBtn;
    private Button noBtn;
    private Button showAnswer;

    private Question[] questions = new Question[]{
            new Question(R.string.question1, true), //0
            new Question(R.string.question2, false), //1
            new Question(R.string.question3, false), //2
            new Question(R.string.question4, true), //3
            new Question(R.string.question5, true) //4
    };

    private int questionIndex = 0; // номер вопроса
    private ArrayList<String> resTest = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("SYSTEM INFO", "Метод onCreate() запущен");
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) { // Если есть сохранённая информация, то достаём её.
            questionIndex = savedInstanceState.getInt("questionIndex");
        }

        textView = findViewById(R.id.textView);
        yesBtn = findViewById(R.id.yesBtn);
        noBtn = findViewById(R.id.noBtn);
        showAnswer = findViewById(R.id.showAnswer);

        textView.setText(questions[questionIndex].getQuestionResId());
        yesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (questions[questionIndex].isAnswerTrue()) {
                    Toast.makeText(MainActivity.this, R.string.correct, Toast.LENGTH_SHORT).show();
                    resTest.add(getString(R.string.correct));
                } else {

                    Toast.makeText(MainActivity.this, R.string.incorrect, Toast.LENGTH_SHORT).show();
                    resTest.add(getString(R.string.incorrect));

                }
                if (questionIndex == questions.length-1) {
                    System.out.println(resTest);
                    Intent intent = new Intent(MainActivity.this, ResTestActivity.class);
                    intent.putExtra("resTest", resTest);
                    startActivity(intent);
                } else if (questionIndex < questions.length-1) {


                    questionIndex++;
                    textView.setText(questions[questionIndex].getQuestionResId());
                }
            }
        });

        noBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (questions[questionIndex].isAnswerTrue()) {
                    Toast.makeText(MainActivity.this, R.string.incorrect, Toast.LENGTH_SHORT).show();
                    resTest.add(getString(R.string.incorrect));
                } else {
                    Toast.makeText(MainActivity.this, R.string.correct, Toast.LENGTH_SHORT).show();
                    resTest.add(getString(R.string.correct));
                }

                if (questionIndex == questions.length-1) {
                    System.out.println(resTest);
                    Intent intent = new Intent(MainActivity.this, ResTestActivity.class);
                    intent.putExtra("resTest", resTest);
                    startActivity(intent);
                } else if (questionIndex < questions.length-1) {


                    questionIndex++;
                    textView.setText(questions[questionIndex].getQuestionResId());
                }
            }
        });

        showAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity.class);
                intent.putExtra("answer", questions[questionIndex].isAnswerTrue());
                startActivity(intent);
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("SYSTEM INFO", "Метод onStart() запущен");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("SYSTEM INFO", "Метод onResume() запущен");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("SYSTEM INFO", "Метод onPause() запущен");
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) { // Метод сохранения данных перед уничтожением активности
        super.onSaveInstanceState(savedInstanceState);
        Log.d("SYSTEM INFO", "Метод onSaveInstanceState() запущен");
        savedInstanceState.putInt("questionIndex", questionIndex); // Добавили элемент по ключу
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("SYSTEM INFO", "Метод onStop() запущен");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("SYSTEM INFO", "Метод onDestroy() запущен");
    }
}
package com.example.hitanshu.multiplicationapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {
    static int num1;
    static int num2;
    static int times;
    static int cor_count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        Random r = new Random();
        MainActivity m1 = new MainActivity();
        num1 = m1.getLowerBound() + r.nextInt(m1.getUpperBound());
        num2 = 1 + r.nextInt(9);
        TextView view1 = findViewById(R.id.textView5);
        TextView view2 = findViewById(R.id.textView6);
        view1.setText(Integer.toString(num1));
        view2.setText(Integer.toString(num2));
        times = m1.getNumQues();
        times--;
    }

    public void submitAnswer(View view) {
        if (times >= 0) {
            MainActivity m1 = new MainActivity();
            int ans = num1 * num2;
            TextView view1 = findViewById(R.id.editText4);
            int user_answer = Integer.parseInt(String.valueOf(view1.getText()));
            if (user_answer == ans) {
                cor_count++;
            }
            view1.setText("");
            TextView view2 = findViewById(R.id.textView11);
            view2.setText(Integer.toString(cor_count));
            if (times != 0) {
                Random r = new Random();
                num1 = m1.getLowerBound() + r.nextInt(m1.getUpperBound());
                num2 = 1 + r.nextInt(9);
                TextView view3 = findViewById(R.id.textView5);
                TextView view4 = findViewById(R.id.textView6);
                view3.setText(Integer.toString(num1));
                view4.setText(Integer.toString(num2));
                }
                times--;
        }

    }
}


package com.example.hitanshu.multiplicationapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     static int lower_bound;
     static int upper_bound;
     static int num_ques;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view)
    {
        Intent intent = new Intent(this,Main2Activity.class);
        TextView view1 = findViewById(R.id.editText);
        TextView view2 = findViewById(R.id.editText2);
        TextView view3 = findViewById(R.id.editText3);
        lower_bound = Integer.parseInt(String.valueOf(view1.getText()));
        upper_bound = Integer.parseInt(String.valueOf(view2.getText()));
        num_ques = Integer.parseInt(String.valueOf(view3.getText()));
        startActivity(intent);
    }

    public int getLowerBound()
    {
        return lower_bound;
    }
    public int getUpperBound()
    {
        return upper_bound;
    }
    public int getNumQues()
    {
        return num_ques;
    }

}

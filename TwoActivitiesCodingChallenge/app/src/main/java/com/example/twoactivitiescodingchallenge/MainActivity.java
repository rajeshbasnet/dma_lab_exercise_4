package com.example.twoactivitiescodingchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.twoactivitiescodingchallenge.extra.MESSAGE";

    Button btnFirst;
    Button btnSecond;
    Button btnThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFirst = (Button) findViewById(R.id.button_first);
        btnSecond = (Button) findViewById(R.id.button_second);
        btnThird = (Button) findViewById(R.id.button_third);
    }

    public void showPassageFirst(View view) {

        Intent intent = new Intent(this, SecondActivity.class);

        if(btnFirst.getId() == view.getId()) {
            String passage = this.getResources().getString(R.string.passage_first);
            intent.putExtra(EXTRA_MESSAGE, passage);
        }

        if(btnSecond.getId() == view.getId()) {
            String passage = this.getResources().getString(R.string.passage_second);
            intent.putExtra(EXTRA_MESSAGE, passage);
        }

        if(btnThird.getId() == view.getId()) {
            String passage = this.getResources().getString(R.string.passage_third);
            intent.putExtra(EXTRA_MESSAGE, passage);
        }

        startActivity(intent);
    }
}
package com.jnu.student;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewHelloWorld = this.findViewById(R.id.text_view_hello_world);
        Button buttonChinese = this.findViewById(R.id.button_hinese);
        Button buttonEnglish = this.findViewById(R.id.button_English);

        buttonChinese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewHelloWorld.setText(R.string.hello);
            }
        });

        buttonEnglish.setOnClickListener(new EnglishClickListener());

        textViewHelloWorld.setText(R.string.helloA);

        this.setTitle("我的第一个应用");

    }
    private TextView textViewHelloWorld;
    private class EnglishClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            textViewHelloWorld.setText(R.string.hello);
        }
    }
}
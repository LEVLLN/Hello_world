package com.example.user.hello_world;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    String uuuus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        uuuus = intent.getStringExtra("extra");
        button = (Button) findViewById(R.id.second_button1);
        textView = (TextView) findViewById(R.id.second_activity_tv1);


    }


    public void getText(View view) {
        button.setText(getIntent().getExtras().getString("extra"));
        textView.setText(uuuus);
    }
}

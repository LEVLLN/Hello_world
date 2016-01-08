package com.example.user.hello_world;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.user.hello_world.R.*;

public class MainActivity extends AppCompatActivity {
private TextView textView;
    private EditText editText;
    private TextView textView2;

    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        textView = (TextView)findViewById(id.textView);
        editText = (EditText)findViewById(id.editText);
        textView2 = (TextView)findViewById(id.textView2);

    }

    public void OneClick(View view) {
         if(editText.getText().length()==0||editText.getText().toString().equals(" ")){
             textView.setText(string.not_enought_symbol); }
             else {
             String strCats = getString(R.string.autohello);
             String t = "Тапочек";
             String l = "Лампочка";

             String finad = String.format(strCats,editText.getText().toString(),t,l);
             textView.setText(finad);
                  editText.setText(null);
             }

    }

    public void CircleButton(View view) {
        i+=1;
        textView2.setHint(String.valueOf(i));
    }
}

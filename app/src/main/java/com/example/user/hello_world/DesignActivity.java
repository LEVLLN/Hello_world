package com.example.user.hello_world;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class DesignActivity extends AppCompatActivity {
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verstka_layout);
        tv1 = (TextView) findViewById(R.id.contactName);
        tv5 = (TextView) findViewById(R.id.telephone_name);
        tv6 = (TextView) findViewById(R.id.telephone_value);
        tv2 = (TextView) findViewById(R.id.personalAccountName);
        tv3 = (TextView) findViewById(R.id.personalAccountId);
        tv4 = (TextView) findViewById(R.id.like_a_button);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return true;                            //закрывает данный layout
    }

    public void SendMoney(View view) {
        tv1.setText("ЖОПА");
        tv2.setText("ЖОПА");
        tv3.setText("ЖОПА");

    }
}


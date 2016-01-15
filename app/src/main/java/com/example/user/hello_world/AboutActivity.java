package com.example.user.hello_world;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class AboutActivity extends AppCompatActivity {
    Button button;
    String[] names = {"Lev", "Viktor", "Alexander", "QQQepta"};
    ListView listView;
    List<Product> list = new ArrayList<Product>();
    MyAdapter myAdapter;
    List<Product> newProducts = new ArrayList<Product>();
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myAdapter = new MyAdapter(this, list);
        setContentView(R.layout.activity_about);
        button = (Button) findViewById(R.id.button2);

        fillData();
        listView = (ListView) findViewById(R.id.lvMain);
        listView.setAdapter(new MyAdapter(this, list));


//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,names);
//        listView.setAdapter(adapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String text = names[position];
//                button.setText(text);
//            }
//        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //кнопка "назад"
    }

    void fillData() {
        for (int i = 1; i <= 20; i++) {
            list.add(new Product("Product " + i, i * 1000,false));
        }
    }

//кастомный адаптер ,кастомные итемы

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;                            //закрывает данный layout
        }
        int id = item.getItemId();
        switch (id) {
            case R.id.cat1:
                button.setText("1111");
        }
        return super.onOptionsItemSelected(item);
    }

    public void showResult(View v) {
        String result = "Вы выбрали:";
        for (Product p : myAdapter.getBox()) {
            result += "\n" + p.name;
        }
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
    }
}

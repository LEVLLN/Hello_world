package com.example.user.hello_world;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class MyAdapter extends BaseAdapter {
    Context context;
    LayoutInflater layoutInflater;
    List<Product> productList = new ArrayList<>();


    MyAdapter(Context context1,List<Product> products){
        context = context1;
        productList = products;
        layoutInflater = LayoutInflater.from(context);
     //   layoutInflater = (LayoutInflater) context.getSystemService(Context.LAUNCHER_APPS_SERVICE);

    }


    @Override
    public int getCount() {
       return productList.size();
    }

    @Override
    public Object getItem(int position) {
        return productList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view =convertView;
        if(view==null){
            view = layoutInflater.inflate(R.layout.item,parent,false);

        }

        Product product = (Product) getItem(position);

        ((TextView)view.findViewById(R.id.name)).setText(product.name);
        ((TextView)view.findViewById(R.id.price)).setText(String.valueOf(product.price));

        CheckBox checkBox;
        checkBox = (CheckBox)view.findViewById(R.id.checkbox);
        checkBox.setOnCheckedChangeListener(myCheckChangList);
        checkBox.setTag(position);
        checkBox.setChecked(product.box);

        return view;
    }
    Product getProduct(int position) {
        return ((Product) getItem(position));
    }

    ArrayList<Product> getBox() {
        ArrayList<Product> box = new ArrayList<Product>();
        for (Product p : productList) {
            if(p.box){
                box.add(p);}
        }
        return box;
    }

    CompoundButton.OnCheckedChangeListener myCheckChangList = new CompoundButton.OnCheckedChangeListener() {
        public void onCheckedChanged(CompoundButton buttonView,
                                     boolean isChecked) {
            // меняем данные товара (в корзине или нет)
            getProduct((Integer) buttonView.getTag()).box = isChecked;
        }
    };
}


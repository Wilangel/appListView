package com.udc.listview_use;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private TextView tv2;
    private ListView lv1;
    private ImageView iv1;

    private String nombres [] = {"Wilson Herrera","Yerlis Berrio","Kleyber Herrera","Marysol Herrera","Angel Herrera"};
    private String edades[]= {"37","35","17","14","8"};
    private String imagenes []= {"w","y","k","m","a"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv2 = (TextView) findViewById(R.id.tv2);
        lv1 = (ListView) findViewById(R.id.Lv1);
        iv1=(ImageView) findViewById(R.id.iv1);


        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,R.layout.list_item_familia, nombres);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv2.setText(lv1.getItemAtPosition(i)+" tiene "+ edades[i] + " años ");

                if (i==0) iv1.setImageResource(R.drawable.w);
                if (i==1) iv1.setImageResource(R.drawable.y);
                if (i==2) iv1.setImageResource(R.drawable.k);
                if (i==3) iv1.setImageResource(R.drawable.m);
                if (i==4) iv1.setImageResource(R.drawable.a);


            }
        });
    }
}
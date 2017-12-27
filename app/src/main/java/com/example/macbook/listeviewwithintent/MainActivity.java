package com.example.macbook.listeviewwithintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;


public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] names = {"Karen", "Martin", "Movses", "Gurgen"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, Arrays.asList(names));
        listView.setAdapter(arrayAdapter);

    }
}

package com.example.hw3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycleViewFirst;
    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<String> number = new ArrayList<>();
    private AdapterPerson adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycleViewFirst = findViewById(R.id.recycleViewFirst);
        loadData();
        adapter = new AdapterPerson(names, number);
        recycleViewFirst.setAdapter(adapter);
    }
    private void loadData() {
        names.add("Rafhat");
        number.add("+996703881198");
        names.add("Kasymov");
        number.add("+996755164578");
        names.add("name1");
        number.add("+996755164578");
        names.add("name2");
        number.add("+996705453326");
        names.add("name3");
        number.add("+996999455652");
        names.add("name4");
        number.add("+996776868645");
        names.add("name5");
        number.add("+996555456502");
        names.add("name6");
        number.add("+996705123366");
        names.add("name7");
        number.add("+996755113695");
        names.add("name8");
        number.add("+996709232366");
        names.add("name9");
        number.add("+996999466253");
        names.add("name10");
        number.add("+996999485565");
        names.add("name11");
        number.add("+996755451535");
        names.add("name12");
        number.add("+996755858585");
        names.add("name13");

    }
}
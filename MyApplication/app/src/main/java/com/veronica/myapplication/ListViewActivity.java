package com.veronica.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

    ListView simpleList;
    String countryList[] = {"India", "China", "australia", "Portugle", "America", "NewZealand"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        simpleList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list, R.id.textView, countryList);
        simpleList.setAdapter(arrayAdapter);

    }
}

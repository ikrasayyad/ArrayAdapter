package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView simpleListView;

    String courselist[] ={"Rose","sunflower","Lotus","Marigold","Lily"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleListView =findViewById(R.id.simplelistView);

        ArrayAdapter <String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.activity_array_adapter,R.id.itemTextView, courselist);
        simpleListView.setAdapter(arrayAdapter);
    }
}
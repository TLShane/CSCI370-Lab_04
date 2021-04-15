package com.example.asynctask_tl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.student);

        StudentsAsyncTask studentAsyncTask = new StudentsAsyncTask(listView,this);

        studentAsyncTask.execute();

    }
}
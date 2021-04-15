package com.example.asynctask_tl;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;
import java.util.ArrayList;

class StudentsAsyncTask extends AsyncTask<Void,Void, ArrayList<Student>> {

    private ListView listView;
    private Context context;

    public StudentsAsyncTask(ListView listview, Context context){
        this.listView = listview;
        this.context = context;
    }


    @Override
    protected ArrayList<Student> doInBackground(Void... voids) {
        StudentInfo studentDao = new StudentInfo();

        return studentDao.getAllStudents();
    }

    @Override
    protected void onPostExecute(ArrayList<Student> students) {
        super.onPostExecute(students);

        StudentAdapter adapter = new StudentAdapter(context, students);
        listView.setAdapter(adapter);
    }
}
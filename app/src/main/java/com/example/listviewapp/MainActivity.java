package com.example.listviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView classSchedule;
    private String [] classes = {"Android App Development", "Computing in Society", "Printmaking", "Entrepreneurship","CITA Capstone"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        classSchedule = this.findViewById(R.id.class_schedule);
        ArrayAdapter adapt = new ArrayAdapter (this, android.R.layout.simple_list_item_1, classes);
        classSchedule.setAdapter(adapt);

        classSchedule.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast toast = Toast.makeText(getApplicationContext(), "EVERYTHINGS ON FIRE", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        classSchedule.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast toast = Toast.makeText(getApplicationContext(), "NOW EVERYTHING IS EVEN MORE ON FIRE!", Toast.LENGTH_SHORT);
                toast.show();
                return true;
            }
        });
    }
}

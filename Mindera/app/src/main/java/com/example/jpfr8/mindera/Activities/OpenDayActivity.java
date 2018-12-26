package com.example.jpfr8.mindera.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.jpfr8.mindera.Model.Event;
import com.example.jpfr8.mindera.Model.OpenDay;
import com.example.jpfr8.mindera.R;

import java.util.ArrayList;
import java.util.List;

public class OpenDayActivity extends AppCompatActivity {

    private OpenDay openDay;
    private List<Event> eventList;
    private ListView listView;
    private ArrayAdapter adapter;

    private static final String OPEN_DAY = "Open Day '18_";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_open_day);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        Intent intent = getIntent();
        this.openDay = (OpenDay) intent.getSerializableExtra("openDay");
        this.eventList = this.openDay.getEventList();
        this.listView = (ListView) findViewById(R.id.list_view);
        this.adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, eventList);
        this.listView.setAdapter(adapter);
        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(OpenDayActivity.this, EventActivity.class);
                intent.putExtra("event",eventList.get(position));
                startActivity(intent);
            }
        });

        getSupportActionBar().setTitle(OPEN_DAY + openDay.getName());


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }

    private List<String> getNameList(List<Event> events){
        List<String> list = new ArrayList<>();

        for(Event event : events){
            list.add(event.getName());
        }

        return list;
    }

}

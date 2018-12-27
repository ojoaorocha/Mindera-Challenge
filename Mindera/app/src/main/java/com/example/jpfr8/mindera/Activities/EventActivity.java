package com.example.jpfr8.mindera.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import com.example.jpfr8.mindera.Adapters.GridAdapter;
import com.example.jpfr8.mindera.Model.Event;
import com.example.jpfr8.mindera.R;

import java.lang.reflect.Array;
import java.util.List;

public class EventActivity extends AppCompatActivity {

    private Event event;
    private List<String> list;
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        Intent intent = getIntent();
        this.event = (Event) intent.getSerializableExtra("event");
        this.list = event.getList();
        this.gridView = (GridView) findViewById(R.id.grid_view);

        GridAdapter adapter = new GridAdapter(EventActivity.this, this.list);

        this.gridView.setAdapter(adapter);
        this.gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(EventActivity.this,"Not implemented!", Toast.LENGTH_SHORT).show();
            }

        });

        getSupportActionBar().setTitle(this.event.getName());

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }

}

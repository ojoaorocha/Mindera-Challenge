package com.example.jpfr8.mindera.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.jpfr8.mindera.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class VacanciesFragment extends Fragment {

    private Map<String,String> map;
    private ListView listView;
    private ArrayAdapter adapter;

    public VacanciesFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.vacancies_fragment_layout, container, false);

        this.listView = view.findViewById(R.id.list_view);

        List<Map<String,String>> list = new ArrayList<>();
        SimpleAdapter adapter = new SimpleAdapter(getContext(), list, R.layout.list_item,
                new String[]{"First line","Second line"},
                new int[]{R.id.job_txt,R.id.local_txt});

        Iterator it = getMap().entrySet().iterator();
        while(it.hasNext()){
            HashMap<String, String> resultMap = new HashMap<>();
            Map.Entry pair = (Map.Entry)it.next();
            resultMap.put("First line", pair.getKey().toString());
            resultMap.put("Second line", pair.getValue().toString());
            list.add(resultMap);
        }

        this.listView.setAdapter(adapter);

        return view;
    }


    public Map<String,String> getMap(){
        Map<String,String> map = new HashMap<>();

        map.put("Android Developer","Porto");
        map.put("Backed Software Engineer","Porto");
        map.put("Frontend Software engineer","Porto");
        map.put(".NET Software Engineer","Aveiro");
        map.put("IOS Developer","Lisboa");
        map.put("Frontend Software engineer","Lisboa");
        map.put("Backend Software engineer","Lisboa");
        map.put("Office & People Operations","Aveiro");

        return map;
    }
}

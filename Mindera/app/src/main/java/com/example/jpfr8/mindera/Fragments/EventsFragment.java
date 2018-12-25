package com.example.jpfr8.mindera.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jpfr8.mindera.Adapters.OpenDaysAdapter;
import com.example.jpfr8.mindera.Model.GraduateProgram;
import com.example.jpfr8.mindera.Model.OpenDay;
import com.example.jpfr8.mindera.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class EventsFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<OpenDay> openDayList;

    public EventsFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static EventsFragment newInstance(int sectionNumber) {
        EventsFragment fragment = new EventsFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.event_fragment_layout, container, false);

        this.openDayList = getOpenDays();

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);
//        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new OpenDaysAdapter(openDayList);
        mRecyclerView.setAdapter(mAdapter);


        return rootView;
    }


    public List<OpenDay> getOpenDays(){
        List<OpenDay> openDayList = new ArrayList<>();
        OpenDay day1 = new OpenDay("Day 1");
        OpenDay day2 = new OpenDay("Day 2");
        OpenDay day3 = new OpenDay("Day 3");
        OpenDay day4 = new OpenDay("Day 4");
        OpenDay day5 = new OpenDay("Day 5");

        openDayList.add(day1);
        openDayList.add(day2);
        openDayList.add(day3);
        openDayList.add(day4);
        openDayList.add(day5);

        return openDayList;
    }
}

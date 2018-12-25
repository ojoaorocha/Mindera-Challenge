package com.example.jpfr8.mindera.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jpfr8.mindera.Adapters.GraduateProgramsAdapter;
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
    private RecyclerView.LayoutManager mLayoutManager2;
    private List<OpenDay> openDayList;
    private List<GraduateProgram> graduateProgramList;

    private RecyclerView mRecyclerView2;


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
        this.graduateProgramList = getGraduateProgram();

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new OpenDaysAdapter(openDayList);
        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView2 = (RecyclerView) rootView.findViewById(R.id.recycler_view2);
        mLayoutManager2 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView2.setLayoutManager(mLayoutManager2);
        mAdapter = new GraduateProgramsAdapter(graduateProgramList);
        mRecyclerView2.setAdapter(mAdapter);

        return rootView;
    }


    private List<OpenDay> getOpenDays(){
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

    private List<GraduateProgram> getGraduateProgram(){
        List<GraduateProgram> graduateProgramList = new ArrayList<>();
        GraduateProgram program1 = new GraduateProgram("Program 1");
        GraduateProgram program2 = new GraduateProgram("Program 2");
        GraduateProgram program3 = new GraduateProgram("Program 3");
        GraduateProgram program4 = new GraduateProgram("Program 4");
        GraduateProgram program5 = new GraduateProgram("Program 5");

        graduateProgramList.add(program1);
        graduateProgramList.add(program2);
        graduateProgramList.add(program3);
        graduateProgramList.add(program4);
        graduateProgramList.add(program5);

        return graduateProgramList;
    }
}

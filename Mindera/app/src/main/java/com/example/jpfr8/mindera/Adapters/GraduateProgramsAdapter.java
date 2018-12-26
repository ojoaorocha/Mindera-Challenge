package com.example.jpfr8.mindera.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jpfr8.mindera.Model.GraduateProgram;
import com.example.jpfr8.mindera.R;

import java.util.List;

public class GraduateProgramsAdapter extends RecyclerView.Adapter<GraduateProgramsAdapter.GraduateProgramHolder> {

    private Context context;
    private List<GraduateProgram> items;

    public GraduateProgramsAdapter(Context context, List<GraduateProgram> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public GraduateProgramHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View openDaysView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_layout, viewGroup, false);
        GraduateProgramsAdapter.GraduateProgramHolder holder = new GraduateProgramHolder(openDaysView);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull GraduateProgramHolder graduateProgramHolder, int i) {
        graduateProgramHolder.textView.setText(items.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class GraduateProgramHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView textView;

        public GraduateProgramHolder(View view) {
            super(view);
            cardView = view.findViewById(R.id.card_view);
            textView = view.findViewById(R.id.card_txt);
        }
    }
}

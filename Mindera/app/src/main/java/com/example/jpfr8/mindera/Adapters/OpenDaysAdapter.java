package com.example.jpfr8.mindera.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jpfr8.mindera.Model.OpenDay;
import com.example.jpfr8.mindera.R;

import java.util.List;

public class OpenDaysAdapter extends RecyclerView.Adapter<OpenDaysAdapter.OpenDaysViewHolder> {

    private Context context;
    private List<OpenDay> items;

    public OpenDaysAdapter(List<OpenDay> items){
        this.items = items;
    }

    @Override
    public OpenDaysViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View openDaysView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_layout, viewGroup, false);
        OpenDaysViewHolder holder = new OpenDaysViewHolder(openDaysView);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull OpenDaysViewHolder openDaysViewHolder, int i) {
        openDaysViewHolder.textView.setText(items.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class OpenDaysViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView textView;

        public OpenDaysViewHolder(View view) {
            super(view);
            cardView = view.findViewById(R.id.card_view);
            textView = view.findViewById(R.id.card_txt);
        }
    }
}

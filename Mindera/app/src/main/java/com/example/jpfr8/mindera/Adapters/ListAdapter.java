package com.example.jpfr8.mindera.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.jpfr8.mindera.Model.Event;
import com.example.jpfr8.mindera.R;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {

    private Context context;
    private List<Event> items;

    public ListAdapter(Context context, List<Event> items){
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View ListView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_layout, viewGroup, false);
        ListViewHolder holder = new ListViewHolder(ListView);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder listViewHolder, int i) {
        final Event event = items.get(i);
        listViewHolder.textView.setText(event.getName());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ListView listView;
        TextView textView;

        public ListViewHolder(View view) {
            super(view);
            listView = view.findViewById(R.id.list_view);
        }
    }
}

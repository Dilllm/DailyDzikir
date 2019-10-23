package com.example.dailydzikir;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class DzikirAdapter extends RecyclerView.Adapter<DzikirAdapter.DzikirHolder> {

    private ArrayList<ModelDzikir> listdata;

    public DzikirAdapter(ArrayList<ModelDzikir> listdata) {
        this.listdata = listdata;
    }

    @NonNull
    @Override
    public DzikirHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.raw_list, viewGroup, false);
        return new DzikirHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DzikirHolder dzikirHolder, int i) {
        dzikirHolder.binView(listdata.get(i));
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class DzikirHolder extends RecyclerView.ViewHolder {
        TextView tvJudul, tvsubJudul;

        public DzikirHolder(@NonNull View itemView) {
            super(itemView);
            tvJudul = itemView.findViewById(R.id.tvJududl);
            tvsubJudul = itemView.findViewById(R.id.subJudul);
        }

        private void binView(ModelDzikir data) {
            tvJudul.setText(data.getJudul());
            tvsubJudul.setText(data.getSubjudul());
        }
    }
}

package com.midtermmad3125.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.midtermmad3125.Modal.Weather;
import com.midtermmad3125.R;
import com.midtermmad3125.ui.WeatherListActivity;

import java.util.List;

public class List_Adapter  extends RecyclerView.Adapter<List_Adapter.Myviewholder>{

    private List<Weather> WeatherList;
    private Context mcontext;
    public List_Adapter(List<Weather> weathers) {
        WeatherList = weathers;
    }

    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.custom_wlist, viewGroup, false);
        mcontext = viewGroup.getContext();
        return new Myviewholder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder myviewholder, int i) {
        final Weather w1 = WeatherList.get(i);

        myviewholder.city.setText("city Name::"+w1.getCity());

        myviewholder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(mcontext, WeatherListActivity.class);
                mcontext.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return WeatherList.size();
    }

    public class Myviewholder extends RecyclerView.ViewHolder
    {
        public TextView city,longitude,latitude,population;

        public Myviewholder(  View itemView) {
            super(itemView);

             //String city=(TextView) itemView.findViewById(R.id.textCity);
            // String longitude =(TextView) itemView.findViewById(R.id.textlong);
             //String


        }
    }

}

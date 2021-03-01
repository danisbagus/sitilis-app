package com.example.sitilis;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListCityAdapter extends RecyclerView.Adapter<ListCityAdapter.ListViewHolder> {
    private ArrayList<City> listCity;

    private OnItemClickCallback onItemClickCallback;

    ListCityAdapter(ArrayList<City> list){
        this.listCity = list;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_city, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        City city = listCity.get(position);
        Glide.with(holder.itemView.getContext())
                .load(city.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(city.getName());
        holder.tvLocation.setText(city.getLocation());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listCity.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listCity.size();
    }

    public class ListViewHolder  extends RecyclerView.ViewHolder{
        TextView tvName, tvLocation;
        ImageView imgPhoto;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.city_name);
            tvLocation = itemView.findViewById(R.id.location);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(City data);
    }
}

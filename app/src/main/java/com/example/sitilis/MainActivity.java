package com.example.sitilis;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCity;
    private ArrayList<City> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setActionBarTitle("Home");

        rvCity = findViewById(R.id.rv_city);
        rvCity.setHasFixedSize(true);

        list.addAll(CityData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCity.setLayoutManager(new LinearLayoutManager(this));
        ListCityAdapter listCityAdapter = new ListCityAdapter(list);
        rvCity.setAdapter(listCityAdapter);

        listCityAdapter.setOnItemClickCallback(new ListCityAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(City data) {
                showSelectedCity(data);
            }
        });

    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_about:
                Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(aboutIntent);
                break;
        }
    }

    private void showSelectedCity(City city) {
        Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);
        detailIntent.putExtra(DetailActivity.EXTRA_NAME, city.getName());
        detailIntent.putExtra(DetailActivity.EXTRA_LOCATION, city.getLocation());
        detailIntent.putExtra(DetailActivity.EXTRA_DETAIL, city.getDetail());
        detailIntent.putExtra(DetailActivity.EXTRA_PHOTO, city.getPhoto());
        startActivity(detailIntent);
//        Toast.makeText(this, "Go to detail page of " + city.getName(), Toast.LENGTH_SHORT).show();
    }
}

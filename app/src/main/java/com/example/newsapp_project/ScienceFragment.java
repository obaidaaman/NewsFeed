package com.example.newsapp_project;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ScienceFragment extends Fragment {

    String api="85b7b68ca4f54672ab1471ac67dbce8e";
    ArrayList<ModelClass> modelClassArrayList;
    RecyclerViewAdapter adapter;
    String country="in";

    private String category="Science";

    private RecyclerView recyclerViewScience;

    public ScienceFragment() {
        // Required empty public constructor
    }







    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View viewScience= inflater.inflate(R.layout.fragment_science, container, false);
        recyclerViewScience=viewScience.findViewById(R.id.recyclerViewScience);
        modelClassArrayList=new ArrayList<>();
        recyclerViewScience.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new RecyclerViewAdapter(getContext(),modelClassArrayList);
        recyclerViewScience.setAdapter(adapter);

        findNews();



        return viewScience;
    }

    private void findNews() {
        ApiUtilities.getApiInterface().getCategoryNews(country,category,100,api).enqueue(new Callback<MainNews>() {
            @Override
            public void onResponse(Call<MainNews> call, Response<MainNews> response) {
                if (response.isSuccessful()){
                    modelClassArrayList.addAll(response.body().getArticles());
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<MainNews> call, Throwable t) {

            }
        });
    }

    }

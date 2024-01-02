package com.example.android1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.android1.databinding.ActivityTimeLineBinding;

public class TimeLine extends AppCompatActivity {
    ActivityTimeLineBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityTimeLineBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        RecyclerViewAdaptor recyclerViewAdaptor=new RecyclerViewAdaptor();
        binding.recyclyerUser.setAdapter(recyclerViewAdaptor);
    }
}
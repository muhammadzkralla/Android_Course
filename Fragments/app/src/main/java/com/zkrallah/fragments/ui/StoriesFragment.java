package com.zkrallah.fragments.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.zkrallah.fragments.R;
import com.zkrallah.fragments.adapter.StoryAdapter;
import com.zkrallah.fragments.databinding.FragmentStoriesBinding;
import com.zkrallah.fragments.model.Story;

import java.util.ArrayList;
import java.util.List;

public class StoriesFragment extends Fragment {

    FragmentStoriesBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentStoriesBinding.inflate(inflater, container, false);

        List<Story> list = getData();

        StoryAdapter adapter = new StoryAdapter(list, getActivity());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());

        binding.recycler.setAdapter(adapter);
        binding.recycler.setLayoutManager(layoutManager);

        return binding.getRoot();
    }

    private List<Story> getData() {
        List<Story> result = new ArrayList<>();

        Story first = new Story("Hossam", "12:00 AM", R.drawable.ic_baseline_panorama_fish_eye_24);
        Story second = new Story("Mohamed", "06:00 AM", R.drawable.ic_baseline_panorama_fish_eye_24);
        Story third = new Story("Mahmoud", "09:00 AM", R.drawable.ic_baseline_panorama_fish_eye_24);
        Story fourth = new Story("Ahmed", "08:00 AM", R.drawable.ic_baseline_panorama_fish_eye_24);
        Story fifth = new Story("Mostafa", "07:00 AM", R.drawable.ic_baseline_panorama_fish_eye_24);
        Story sixth = new Story("Abdelrahman", "06:00 AM", R.drawable.ic_baseline_panorama_fish_eye_24);
        Story seventh = new Story("Wael", "06:00 AM", R.drawable.ic_baseline_panorama_fish_eye_24);

        result.add(first);
        result.add(second);
        result.add(third);
        result.add(fourth);
        result.add(fifth);
        result.add(sixth);
        result.add(seventh);

        return result;
    }
}
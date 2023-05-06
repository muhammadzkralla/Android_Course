package com.zkrallah.fragments.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.zkrallah.fragments.R;
import com.zkrallah.fragments.adapter.ChatAdapter;
import com.zkrallah.fragments.databinding.FragmentChatsBinding;
import com.zkrallah.fragments.model.Chat;

import java.util.ArrayList;
import java.util.List;

public class ChatsFragment extends Fragment {

    FragmentChatsBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentChatsBinding.inflate(inflater, container, false);

        // Get our data that will be showed on the screen.
        List<Chat> list = getData();

        // Create the adapter instance of the ChatAdapter with the data that
        // the adapter will distribute over the recycler view.
        ChatAdapter adapter = new ChatAdapter(list, getActivity());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());

        binding.recycler.setAdapter(adapter);
        binding.recycler.setLayoutManager(layoutManager);

        return binding.getRoot();
    }

    private List<Chat> getData() {
        List<Chat> result = new ArrayList<>();

        Chat first = new Chat("Hossam", "Hi There !", R.drawable.ic_baseline_person_24);
        Chat second = new Chat("Mohamed", "Good Morning !", R.drawable.ic_baseline_person_24);
        Chat third = new Chat("Hassan", "Hello !", R.drawable.ic_baseline_person_24);
        Chat fourth = new Chat("Kareem", "Hey", R.drawable.ic_baseline_person_24);
        Chat fifth = new Chat("Ahmed", "How are you ?", R.drawable.ic_baseline_person_24);
        Chat sixth = new Chat("Raouf", "Hi There !", R.drawable.ic_baseline_person_24);
        Chat seventh = new Chat("Ali", "Hi There !", R.drawable.ic_baseline_person_24);


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

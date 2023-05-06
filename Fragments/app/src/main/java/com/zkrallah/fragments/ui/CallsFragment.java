package com.zkrallah.fragments.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.zkrallah.fragments.R;
import com.zkrallah.fragments.adapter.CallAdapter;
import com.zkrallah.fragments.databinding.FragmentCallsBinding;
import com.zkrallah.fragments.model.Call;

import java.util.ArrayList;
import java.util.List;

public class CallsFragment extends Fragment {

    FragmentCallsBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCallsBinding.inflate(inflater, container, false);

        // Get our data that will be showed on the screen.
        List<Call> list = getData();

        // Create the adapter instance of the CallAdapter with the data that
        // the adapter will distribute over the recycler view.
        CallAdapter adapter = new CallAdapter(list, getActivity());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());

        binding.recycler.setAdapter(adapter);
        binding.recycler.setLayoutManager(layoutManager);

        return binding.getRoot();
    }

    private List<Call> getData() {
        List<Call> result = new ArrayList<>();

        Call first = new Call("Hossam", "12:00 AM", R.drawable.ic_baseline_call_24);
        Call second = new Call("Mohamed", "06:00 AM", R.drawable.ic_baseline_call_24);
        Call third = new Call("Kareem", "09:00 AM", R.drawable.ic_baseline_call_24);
        Call fourth = new Call("Ahmed", "08:00 AM", R.drawable.ic_baseline_call_24);
        Call fifth = new Call("Wael", "07:00 AM", R.drawable.ic_baseline_call_24);
        Call sixth = new Call("Tarek", "06:00 AM", R.drawable.ic_baseline_call_24);
        Call seventh = new Call("Mahmoud", "04:00 AM", R.drawable.ic_baseline_call_24);

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

package com.zkrallah.adapterdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.zkrallah.adapterdemo.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    // Use ActivityBinding to make it more easy to call the Views.
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // How we initialize the ActivityBinding.
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Get the list of employees from the Database.
        List<Employee> data = getData();

        // Pass the list of employees we got from the Database to the Adapter
        // to create a new item for each employee with his data.
        MainAdapter adapter = new MainAdapter(MainActivity.this, data);
        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        // Set the Adapter and Layout Manager of the RecyclerView.
        binding.recycler.setAdapter(adapter);
        binding.recycler.setLayoutManager(layoutManager);

    }

    // As we don't have a real Database in this project, we
    // are going to create our own list of employees
    // and return them as if they were fetched by a real Database.
    private List<Employee> getData() {
        List<Employee> employees = new ArrayList<>();

        // Creating A group of employees.
        Employee first = new Employee("Hossam",
                "Android Developer",
                100.0,
                R.drawable.ic_baseline_person_24);
        Employee second = new Employee("Mohamed",
                "Android Developer",
                90.0,
                R.drawable.ic_launcher_background);
        Employee third = new Employee("Ahmed",
                "Ios Developer",
                80.0,
                R.drawable.ic_baseline_person_24);
        Employee fourth = new Employee("Ebrahim",
                "Front-end Developer",
                70.0,
                R.drawable.ic_launcher_background);
        Employee fifth = new Employee("Kareem",
                "Back-end Developer",
                60.0,
                R.drawable.ic_baseline_person_24);
        Employee sixth = new Employee("Sherif",
                "Machine learning Developer",
                50.0,
                R.drawable.ic_launcher_background);
        Employee seventh = new Employee("Omar",
                "Ai Engineer",
                40.0,
                R.drawable.ic_baseline_person_24);
        Employee eighth = new Employee("Ali",
                "Software Consultant",
                30.0,
                R.drawable.ic_launcher_background);
        Employee ninth = new Employee("Bassem",
                "Senior Developer",
                20.0,
                R.drawable.ic_baseline_person_24);
        Employee tenth = new Employee("Tarek",
                "Flutter Developer",
                10.0,
                R.drawable.ic_launcher_background);

        // Adding the employees to the list.
        employees.add(first);
        employees.add(second);
        employees.add(third);
        employees.add(fourth);
        employees.add(fifth);
        employees.add(sixth);
        employees.add(seventh);
        employees.add(eighth);
        employees.add(ninth);
        employees.add(tenth);

        // return the list.
        return employees;
    }
}

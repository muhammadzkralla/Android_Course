package com.zkrallah.demo;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.zkrallah.demo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    // Use ActivityBinding to make it more easy to call the Views.
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // How we initialize the ActivityBinding.
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Button Click Listener to Show a Toast containing the Text passed to the EditText.
        binding.btn.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, binding.edt.getText(), Toast.LENGTH_SHORT).show());

        // Click Listener to inform you that the TextView is Clicked.
        binding.txtView.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Text Clicked", Toast.LENGTH_SHORT).show());

        // This Click Listener shows us which Radio Button is selected in a Radio Group.
        binding.group.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton selected = MainActivity.this.findViewById(checkedId);
            Toast.makeText(MainActivity.this, "selected : " + selected.getText(), Toast.LENGTH_SHORT).show();
        });

        // This Click Listener shows us whether the CheckBox is checked or not.
        binding.checkbox.setOnClickListener(v -> {
            if (binding.checkbox.isChecked()) {
                Toast.makeText(MainActivity.this, "checked", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "unchecked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

package com.zkrallah.lifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.zkrallah.lifecycle.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    // Use ActivityBinding to make it more easy to call the Views.
    ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // How we initialize the ActivityBinding.
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // A Click Listener to call the finish() method which kill the current Activity.
        binding.btn.setOnClickListener(v -> finish());
    }
}
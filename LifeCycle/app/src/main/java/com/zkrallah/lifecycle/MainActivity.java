package com.zkrallah.lifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.zkrallah.lifecycle.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    // Use ActivityBinding to make it more easy to call the Views.
    ActivityMainBinding binding;
    // This is the TAG message to help us find the Logs we created.
    private final String TAG = "LifeCycleStatus";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // How we initialize the ActivityBinding.
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        // A Log to tell when the onCreate method is called by Android.
        Log.d(TAG, "onCreate: ");
        
        // This Click Listener is to Navigate to the SecondActivity.
        binding.btn.setOnClickListener(v -> {
            // Here we create an Intent.                 from                to
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            // Start the Intent.
            startActivity(intent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        // A Log to tell when the onStart method is called by Android.
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        // A Log to tell when the onResume method is called by Android.
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        // A Log to tell when the onPause method is called by Android.
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        // A Log to tell when the onStop method is called by Android.
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // A Log to tell when the onDestroy method is called by Android.
        Log.d(TAG, "onDestroy: ");
    }
}
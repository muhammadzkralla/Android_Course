package com.zkrallah.coffeemaker;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

import com.zkrallah.coffeemaker.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    StringBuilder order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // A StringBuilder to store the order in before we send it with email.
        order = new StringBuilder();

        // Getting the selected coffee from the RadioGroup.
        binding.group.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton selected = findViewById(checkedId);
            // Clear the order before placing a new one.
            order.setLength(0);

            if (selected != null){
                order.append("Selected Coffee : ");
                order.append(selected.getText().toString());
            }
        });

        // Once the "ORDER" button is clicked :
        binding.orderBtn.setOnClickListener(v -> {

            // Check if the milk item is checked.
            if (binding.milk.isChecked()) {
                order.append("\nwith Add-on : ");
                order.append("Milk");
            }

            // Check if the whipped cream item is checked.
            if (binding.whippedCream.isChecked()) {
                order.append("\nWith Add-on : ");
                order.append("Whipped Cream");
            }

            // Getting the comment from the EditText.
            String comment = binding.edtTxt.getText().toString();
            if (!comment.isEmpty()){
                order.append("\nand Comment : ");
                order.append(comment);
            }


            // Sending the E-mail with the intent.
            Intent email = new Intent(Intent.ACTION_SEND);
            email.putExtra(Intent.EXTRA_EMAIL, new String[]{"example@gmail.com"});
            email.putExtra(Intent.EXTRA_SUBJECT, "Coffee Order");
            email.putExtra(Intent.EXTRA_TEXT, order.toString());

            //need this to prompts email client only
            email.setType("message/rfc822");

            startActivity(Intent.createChooser(email, "Choose an Email client :"));

        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        // When the mail app open, clear the order
        order.setLength(0);
        binding.group.clearCheck();
    }
}

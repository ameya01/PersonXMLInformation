package com.example.personxmlinformation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    private TextView nameTextView, addressTextView, phoneTextView, urlTextView;
    private Button webButton = null;

    private Person data = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //wire the widgets
        nameTextView = findViewById(R.id.textView2);
        addressTextView = findViewById(R.id.textView3);
        phoneTextView = findViewById(R.id.textView4);
        urlTextView = findViewById(R.id.textView5);
        webButton = findViewById(R.id.button2);

        //get the push data
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        data = (Person)bundle.getSerializable("data");

        //populate the field with data
        nameTextView.setText(data.getName());
        addressTextView.setText(data.getAddress());
        phoneTextView.setText(data.getPhone());
        urlTextView.setText(data.getUrl());

        //deal with webButton
        webButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make an intent to view the url
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(data.getUrl()));

                //startactivity
                startActivity(intent);


            }
        });
    }
}

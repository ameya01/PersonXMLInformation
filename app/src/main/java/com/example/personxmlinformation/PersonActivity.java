package com.example.personxmlinformation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PersonActivity extends AppCompatActivity {

    private TextView nameTextView = null;
    private Button moreButton = null;
    private ImageView personImageView = null;

    private Person data = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);

        // wire objects with widgets
        nameTextView = findViewById(R.id.textView1);
        moreButton   = findViewById(R.id.button);
        personImageView = findViewById(R.id.imageView);

        //get the intent
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        data = (Person) bundle.getSerializable("data");

        // populate textview and image view with data
        nameTextView.setText(data.getName());

        // remove the extension from the name
        String imageName = data.getImage();
        imageName = imageName.substring(0, imageName.indexOf("."));

        int imageId = this.getResources().getIdentifier(
                imageName,
                "drawable",
                this.getPackageName());

        personImageView.setImageResource(imageId);
        //deal with the button
        moreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make an intent and bundle
                Intent intent = new Intent( PersonActivity.this,DetailsActivity.class);
                Bundle bundle = new Bundle();

                //add data to bundle

                bundle.putSerializable("data", data);
                intent.putExtras(bundle);

                //start activity
                startActivity(intent);
            }
        });
    }
}

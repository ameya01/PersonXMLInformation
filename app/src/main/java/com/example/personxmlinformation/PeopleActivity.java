package com.example.personxmlinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PeopleActivity extends AppCompatActivity {

    private ListView peopleListView = null;
    private ArrayAdapter<String> adapter = null;
    private PeopleXMLData data = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people);

        data = new PeopleXMLData(this);

        peopleListView = findViewById(R.id.listView);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data.getNames());
        peopleListView.setAdapter(adapter);

        peopleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(PeopleActivity.this, PersonActivity.class);
                Bundle bundle = new Bundle();

                bundle.putSerializable("data", data.getPerson(i));
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}

package dctc.gp.songlyrics;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Baul extends AppCompatActivity {

    ListView listVbaul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baul);


        String[] songtype = { "ভ্রমর কইও গিয়া","আমি কূলহারা কলংকিনী","গান গাই আমার মনরে বুঝাই","থাকতে যদি না পাই তোমায়",
                "বসন্ত বাতাসে সইগো"



        };

        listVbaul=findViewById(R.id.lvbaul);

        ListAdapter myadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, songtype);
        listVbaul.setAdapter(myadapter);

        listVbaul.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if (position == 0)

                {
                    Intent intent = new Intent(Baul.this, Vromor_koiyo.class);
                    startActivity(intent);
                }

                if (position == 1)

                {
                    Intent intent = new Intent(Baul.this, Shawon_o_rate.class);
                    startActivity(intent);
                }
                if (position == 2)

                {
                    Intent intent = new Intent(Baul.this, Shawon_o_rate.class);
                    startActivity(intent);
                }
                if (position == 3)

                {
                    Intent intent = new Intent(Baul.this, Shawon_o_rate.class);
                    startActivity(intent);
                }
                if (position == 4)

                {
                    Intent intent = new Intent(Baul.this, Shawon_o_rate.class);
                    startActivity(intent);
                }
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case android.R.id.home:
                onBackPressed();
                return true;

        }
        return super.onOptionsItemSelected(item);

    }
}
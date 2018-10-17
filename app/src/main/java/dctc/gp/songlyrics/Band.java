package dctc.gp.songlyrics;

import android.content.Intent;
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

public class Band extends AppCompatActivity {

    ListView listVband;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_band);


        String[] songtype = { "মা","আলাল ও দুলাল","ফিরিয়ে দাও"

        };

        listVband=findViewById(R.id.lvband);

        ListAdapter myadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, songtype);
        listVband.setAdapter(myadapter);

        listVband.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if (position == 0)

                {
                    Intent intent = new Intent(Band.this, Jemsmaa.class);
                    startActivity(intent);
                }

                if (position == 1)

                {
                    Intent intent = new Intent(Band.this, Alal.class);
                    startActivity(intent);
                }

                if (position == 2)

                {
                    Intent intent = new Intent(Band.this, Firiye_daw.class);
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
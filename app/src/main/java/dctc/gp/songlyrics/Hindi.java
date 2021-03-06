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

public class Hindi extends AppCompatActivity {

    ListView listVhindi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi);


        String[] songtype = { "বহত পেয়ার করতে হ্যায়",
        };

        listVhindi=findViewById(R.id.lvhindi);

        ListAdapter myadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, songtype);
        listVhindi.setAdapter(myadapter);

        listVhindi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if (position == 0)

                {
                    Intent intent = new Intent(Hindi.this, Bohot_payeer.class);
                    startActivity(intent);
                }

                if (position == 1)

                {
                    Intent intent = new Intent(Hindi.this, Shawon_o_rate.class);
                    startActivity(intent);
                }
                if (position == 2)

                {
                    Intent intent = new Intent(Hindi.this, Shawon_o_rate.class);
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
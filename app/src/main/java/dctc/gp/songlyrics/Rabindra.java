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

public class Rabindra extends AppCompatActivity {

    ListView listVrabindra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rabindra);


        String[] songtype = { "ভেঙে মোর ঘরের চাবি","তোমার খোলা হাওয়া","এসো হে এসো","আমি চঞ্চল হে","যাও হে শ্যাম রাই কুঞ্জে",
                "যখন পড়বে না মোর"



        };

        listVrabindra=findViewById(R.id.lvrabindra);

        ListAdapter myadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, songtype);
        listVrabindra.setAdapter(myadapter);

        listVrabindra.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if (position == 0)

                {
                    Intent intent = new Intent(Rabindra.this, Vengemor.class);
                    startActivity(intent);
                }

                if (position == 1)

                {
                    Intent intent = new Intent(Rabindra.this, Khula_hawa.class);
                    startActivity(intent);
                }
                if (position == 2)

                {
                    Intent intent = new Intent(Rabindra.this, Shawon_o_rate.class);
                    startActivity(intent);
                }
                if (position == 3)

                {
                    Intent intent = new Intent(Rabindra.this, Shawon_o_rate.class);
                    startActivity(intent);
                }
                if (position == 4)

                {
                    Intent intent = new Intent(Rabindra.this, Shawon_o_rate.class);
                    startActivity(intent);
                }
                if (position == 5)

                {
                    Intent intent = new Intent(Rabindra.this, Shawon_o_rate.class);
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
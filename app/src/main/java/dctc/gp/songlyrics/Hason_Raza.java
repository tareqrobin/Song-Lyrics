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

public class Hason_Raza extends AppCompatActivity {

    ListView listVhason;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hason__raza);


        String[] songtype = { "লোকে বলে বলেরে","নিশা লাগিলো রে","আগুন লাগাইয়া দিলো কনে","তুমি যে ক্ষতি করলা আমার","সোনা বন্ধে আমারে"



        };

        listVhason=findViewById(R.id.lvhason);

        ListAdapter myadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, songtype);
        listVhason.setAdapter(myadapter);

        listVhason.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if (position == 0)

                {
                    Intent intent = new Intent(Hason_Raza.this, Luke_bole.class);
                    startActivity(intent);
                }

                if (position == 1)

                {
                    Intent intent = new Intent(Hason_Raza.this, Nesa_lagilo.class);
                    startActivity(intent);
                }
                if (position == 2)

                {
                    Intent intent = new Intent(Hason_Raza.this, Agun_lagaya.class);
                    startActivity(intent);
                }
                if (position == 3)

                {
                    Intent intent = new Intent(Hason_Raza.this, Tumi_j_khoti.class);
                    startActivity(intent);
                }
                if (position == 4)

                {
                    Intent intent = new Intent(Hason_Raza.this, Sona_bondhe.class);
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
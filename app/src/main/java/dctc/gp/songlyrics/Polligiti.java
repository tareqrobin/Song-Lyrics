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

public class Polligiti extends AppCompatActivity {

    ListView listVpolli;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polligiti);


        String[] songtype = { "সর্বতমঙ্গল রাঁধে","প্রেমের মরা জলে ডুবে না","যদি সুন্দর একখান মুখ পাইতাম"



        };

        listVpolli=findViewById(R.id.lvpolli);

        ListAdapter myadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, songtype);
        listVpolli.setAdapter(myadapter);

        listVpolli.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if (position == 0)

                {
                    Intent intent = new Intent(Polligiti.this, Radhe.class);
                    startActivity(intent);
                }

                if (position == 1)

                {
                    Intent intent = new Intent(Polligiti.this, Premer_mora.class);
                    startActivity(intent);
                }
                if (position == 2)

                {
                    Intent intent = new Intent(Polligiti.this, Jodi_sundor.class);
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
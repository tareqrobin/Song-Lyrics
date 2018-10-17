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

public class Bhatiyali extends AppCompatActivity {

    ListView listVvatiyali;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhatiyali);


        String[] songtype = { "নাও ছাড়িয়া দে","নাইয়ারে নায়ের বাদাম তুইলা"



        };

        listVvatiyali=findViewById(R.id.lvvaliyali);

        ListAdapter myadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, songtype);
        listVvatiyali.setAdapter(myadapter);

        listVvatiyali.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if (position == 0)

                {
                    Intent intent = new Intent(Bhatiyali.this, Nao_chariya.class);
                    startActivity(intent);
                }

                if (position == 1)

                {
                    Intent intent = new Intent(Bhatiyali.this, Nayer.class);
                    startActivity(intent);
                }
                if (position == 2)

                {
                    Intent intent = new Intent(Bhatiyali.this, Shawon_o_rate.class);
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
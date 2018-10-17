package dctc.gp.songlyrics;

import android.app.SearchManager;
import android.content.Context;
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
import android.widget.SearchView;

public class Adhunik extends AppCompatActivity {

    ListView listVadhunik;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adhunik);


        String[] songtype = {"আয় খুকু আয়","স্পর্শের বাইরে তুমি",


        };

        listVadhunik = findViewById(R.id.lvadhunik);

        ListAdapter myadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, songtype);
       listVadhunik.setAdapter(myadapter);

        listVadhunik.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if (position == 0)

                {
                    Intent intent = new Intent(Adhunik.this, Ay_khuku.class);
                    startActivity(intent);
                }

                if (position == 1)

                {
                    Intent intent = new Intent(Adhunik.this, Sporser_baire.class);
                    startActivity(intent);
                }
                if (position == 2)

                {
                    Intent intent = new Intent(Adhunik.this, Shawon_o_rate.class);
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


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater menuInflater = getMenuInflater();
//        menuInflater.inflate(R.menu.menu, menu);
//
//        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
//        SearchView searchView = (SearchView) menu.findItem(R.id.srch).getActionView();
//        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
//        return super.onCreateOptionsMenu(menu);
//
//    }
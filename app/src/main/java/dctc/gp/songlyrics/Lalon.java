package dctc.gp.songlyrics;

import android.content.Intent;
import android.media.Image;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Lalon extends AppCompatActivity {

    ListView listVlalon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lalon);

        String [] songtype = {"ধন্য ধন্য বলি তারে", "জাত গেল জাত গেল বলে", "মিলন হবে কত দিনে"

        };

        listVlalon=findViewById(R.id.lvlalon);

        ListAdapter myadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, songtype);
        listVlalon.setAdapter(myadapter);

        listVlalon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if (position == 0)

                {
                    Intent intent = new Intent(Lalon.this, Dhono.class);
                    startActivity(intent);
                }

                if (position == 1)

                {
                    Intent intent = new Intent(Lalon.this, Jatgelo.class);
                    startActivity(intent);
                }
                if (position == 2)

                {
                    Intent intent = new Intent(Lalon.this, Milon.class);
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
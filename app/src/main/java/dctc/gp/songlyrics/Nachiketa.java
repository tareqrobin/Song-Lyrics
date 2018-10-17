package dctc.gp.songlyrics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Nachiketa extends AppCompatActivity {

    ListView ListVnachiketa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nachiketa);


        final String[] songtype = {"বৃদ্ধাশ্রম", "নিলাঞ্জনা", " যখন সময় থমকে দাঁড়ায়", " অন্তবিহীন পথ চলাই জীবন", "অ্যাম্বিশন",
                " সরকারি কর্মচারী", " এই বেশ ভাল আছি", "ভয়", "চোর", "একদিন স্বপ্নের দিন", "সোনালী প্রান্তরে"


        };

        ListVnachiketa = findViewById(R.id.lvnachiketa);

        ListAdapter myadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, songtype);
        ListVnachiketa.setAdapter(myadapter);

        ListVnachiketa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if (position == 0)

                {
                    Intent intent = new Intent(Nachiketa.this, Bridhashrom.class);
                    startActivity(intent);
                }

                if (position == 1)

                {
                    Intent intent = new Intent(Nachiketa.this, Nilanjona.class);
                    startActivity(intent);
                }
                if (position == 2)

                {
                    Intent intent = new Intent(Nachiketa.this, Jkhn_Somoy.class);
                    startActivity(intent);
                }
                if (position == 3)

                {
                    Intent intent = new Intent(Nachiketa.this, Antobihin.class);
                    startActivity(intent);
                }
                if (position == 4)

                {
                    Intent intent = new Intent(Nachiketa.this, Ambisn.class);
                    startActivity(intent);
                }
                if (position == 5)

                {
                    Intent intent = new Intent(Nachiketa.this, Sarkari.class);
                    startActivity(intent);
                }
                if (position == 6)

                {
                    Intent intent = new Intent(Nachiketa.this, Ai_bes.class);
                    startActivity(intent);
                }
                if (position == 7)

                {
                    Intent intent = new Intent(Nachiketa.this, Voy.class);
                    startActivity(intent);
                }
                if (position == 8)

                {
                    Intent intent = new Intent(Nachiketa.this, Chur.class);
                    startActivity(intent);
                }

                CustomAdapter customAdapter = new CustomAdapter();
                ListVnachiketa.setAdapter(customAdapter);
    }
        class CustomAdapter extends BaseAdapter {


            @Override
            public int getCount() {
                return songtype.length;
            }

            @Override
            public Object getItem(int i) {
                return null;
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                view = getLayoutInflater().inflate(R.layout.style, null);
                TextView textView_type = view.findViewById(R.id.txtstyl);
                textView_type.setText(songtype[i]);
                return view;
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


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
import android.widget.TextView;

public class Nazrul extends AppCompatActivity {

    ListView listVnuzrul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nazrul);


            String[] songtype = { "শাওন রাতে যদি","খেলেছি এ বিশ্বলয়ে","আলগা কর গো খোঁপার বাধন",
                    "এই রাঙামাটির পথে লো", "তুমি সুন্দর তাই চেয়ে থাকি প্রিয়","দূর দ্বীপবাসীনি"
                    ,"নয়ন ভরা জল গো তোমার","মোর প্রিয়া হবে এসো রানী","হারানো হিয়ার নিকুঞ্জ পথে",
                    "চেয়ো না সুনয়না","তুমি আমার সকাল বেলার সুর"



            };

         listVnuzrul=findViewById(R.id.lvnazrul);

            ListAdapter myadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, songtype);
            listVnuzrul.setAdapter(myadapter);

           listVnuzrul.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                    if (position == 0)

                    {
                        Intent intent = new Intent(Nazrul.this, Shawon_o_rate.class);
                        startActivity(intent);
                    }

                    if (position == 1)

                    {
                        Intent intent = new Intent(Nazrul.this, Khelicho_a_bismo.class);
                        startActivity(intent);
                    }
                    if (position == 2)

                    {
                        Intent intent = new Intent(Nazrul.this, Aalga_koro.class);
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
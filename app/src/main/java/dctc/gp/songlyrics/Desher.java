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
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

public class Desher extends AppCompatActivity {

    ListView listVdeser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desher);


        final String[] songtype = {"আমার সোনার বাংলা", "ধন ধান্য পুষ্প ভরা", "আমায় গেঁথে দাওনা মাগো ",
                "আমার দেশের মাটির গন্ধে", "আমার ভাইয়ের রক্তে রাঙানো","এই পদ্মা, এই মেঘনা",
                "এক সাগর রক্তের বিনিময়ে", "একটি বাংলাদেশ তুমি জাগ্রত জনতার",
                "একতারা তুই দেশের কথা ", "জন্ম আমার ধন্য হলো মাগো ", "জয় বাংলা বাংলার জয় ",
                "তীর হারা এই ঢেউয়ের সাগর", "তোমার আমার ঠিকানা পদ্মা মেঘনা যমুনা ",
                "নদীর মাঝি বলে এসো নবীন", "নোঙর তোল তোল সময় যে হোল হোল", "পদ্ম পাতার পানি নয়",
                "পূর্ব দিগন্তে সূর্য উঠেছে ", "প্রতিদিন তোমায় দেখে সূর্য রাগে", "প্রথম বাংলাদেশ,আমার শেষ বাংলাদেশ",
                "মাঝি নাও ছাইড়া দে ", "যে মাটির বুকে ঘুমিয়ে আছে ", "শোনো একটি মুজিবরের থেকে",
                "সবকটা জানালা খুলে দাওনা ", "সবুজের বুকে লাল", "সালাম সালাম হাজার সালাম",
                "সুন্দর সুবর্ণ তারুন্য লাবন্য ", "সূর্যদয়ে তুমি, সূর্যাস্তেও তুমি ", "সেই রেল লাইনের ধারে",
                "সোনা সোনা সোনা ", "হায় রে আমার মন মাতানো দেশ ", "মোরা একটি ফুলকে"};

        listVdeser = findViewById(R.id.lvdeser);

//        ListAdapter myadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, songtype);
//        listVdeser.setAdapter(myadapter);

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
                view = getLayoutInflater().inflate(R.layout.style,null);
                TextView textView_type = view.findViewById(R.id.txtstyl);
                textView_type.setText(songtype[i]);
                return view;
            }
        }
        CustomAdapter customAdapter = new CustomAdapter();
        listVdeser.setAdapter(customAdapter);

        listVdeser.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if (position == 0)

                {
                    Intent intent = new Intent(Desher.this, Amar_shonar.class);
                    startActivity(intent);

                }

                if (position == 1)

                {
                    Intent intent = new Intent(Desher.this, Dhono_dhanne.class);
                    startActivity(intent);

                }
                if (position == 2)

                {
                    Intent intent = new Intent(Desher.this, Amay_gethe.class);
                    startActivity(intent);

                }
                if (position == 3)

                {
                    Intent intent = new Intent(Desher.this, Matir_gondhe.class);
                    startActivity(intent);

                }
                if (position == 4)

                {
                    Intent intent = new Intent(Desher.this, Amar_vaiyer.class);
                    startActivity(intent);

                }
                if (position == 5)

                {
                    Intent intent = new Intent(Desher.this, Ai_padma.class);
                    startActivity(intent);

                }
                if (position == 6)

                {
                    Intent intent = new Intent(Desher.this, Ak_sagar_rokter.class);
                    startActivity(intent);

                }
                if (position == 7)

                {
                    Intent intent = new Intent(Desher.this, Akti_bangladesh.class);
                    startActivity(intent);

                }
                if (position == 8)

                {
                    Intent intent = new Intent(Desher.this, Aktara_tui.class);
                    startActivity(intent);

                }
                if (position == 9)

                {
                    Intent intent = new Intent(Desher.this,Jonnmo_amar.class);
                    startActivity(intent);

                }
                if (position == 10)

                {
                    Intent intent = new Intent(Desher.this, Joy_bangla.class);
                    startActivity(intent);

                }
                if (position == 11)

                {
                    Intent intent = new Intent(Desher.this, Teer_hara.class);
                    startActivity(intent);

                }
                if (position == 12)

                {
                    Intent intent = new Intent(Desher.this,Tumi_amar.class);
                    startActivity(intent);

                }
                if (position == 13)

                {
                    Intent intent = new Intent(Desher.this, Nodir_majhi.class);
                    startActivity(intent);

                }
                if (position == 14)

                {
                    Intent intent = new Intent(Desher.this, Nongor_tolo.class);
                    startActivity(intent);

                }
                if (position == 15)

                {
                    Intent intent = new Intent(Desher.this, Podmo_patar.class);
                    startActivity(intent);

                }
                if (position == 16)

                {
                    Intent intent = new Intent(Desher.this, Purbo_digonte.class);
                    startActivity(intent);

                }
                if (position == 17)

                {
                    Intent intent = new Intent(Desher.this, Protidin_tumay.class);
                    startActivity(intent);

                }
                if (position == 18)

                {
                    Intent intent = new Intent(Desher.this, Prothom_bangladesh.class);
                    startActivity(intent);

                }
                if (position == 19)

                {
                    Intent intent = new Intent(Desher.this, Majhi_nao.class);
                    startActivity(intent);

                }
                if (position == 20)

                {
                    Intent intent = new Intent(Desher.this, Je_matir_buke.class);
                    startActivity(intent);

                }
                if (position == 21)

                {
                    Intent intent = new Intent(Desher.this, Sono_akti_mojibor.class);
                    startActivity(intent);

                }
                if (position == 22)

                {
                    Intent intent = new Intent(Desher.this, Sobkota_janala.class);
                    startActivity(intent);

                }
                if (position == 23)

                {
                    Intent intent = new Intent(Desher.this, Sobojer_buke_lal.class);
                    startActivity(intent);

                }
                if (position == 24)

                {
                    Intent intent = new Intent(Desher.this, Salam_salam.class);
                    startActivity(intent);

                }
                if (position == 25)

                {
                    Intent intent = new Intent(Desher.this, Sundor_suborno.class);
                    startActivity(intent);

                }
                if (position == 26)

                {
                    Intent intent = new Intent(Desher.this, Surjodoye_tumi.class);
                    startActivity(intent);

                }
                if (position == 27)

                {
                    Intent intent = new Intent(Desher.this, Sei_rail_line.class);
                    startActivity(intent);

                }
                if (position == 28)

                {
                    Intent intent = new Intent(Desher.this, Sona_sona.class);
                    startActivity(intent);

                }
                if (position == 29)

                {
                    Intent intent = new Intent(Desher.this, Hayre_amar.class);
                    startActivity(intent);

                }
                if (position == 30)

                {
                    Intent intent = new Intent(Desher.this, Mora_ekti.class);
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
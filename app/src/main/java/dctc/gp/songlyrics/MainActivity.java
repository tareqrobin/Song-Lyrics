package dctc.gp.songlyrics;

import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    String myshare;

    String[] songtype = {"নজরুল সঙ্গীত", "রবীন্দ্র সঙ্গীত", "দেশাত্মবোধক গান", "আধুনিক গান",
            "ক্লাসিক্যাল", "বাউল গান", "লালন", "পল্লীগীতি", "ব্যান্ড", "ভাওয়াইয়া গান", " ভাটিয়ালি গান",
            "জারি গান", "সারি গান", "হাসন রাজার গান", "নচিকেতা স্পেশাল", "হিন্দি গান", "ইংরেজী গান"};

    int[] Images = {R.drawable.nazrul, R.drawable.rabindra, R.drawable.desh, R.drawable.modern,
            R.drawable.classic, R.drawable.baul, R.drawable.lalon, R.drawable.polli, R.drawable.band,
            R.drawable.vaya, R.drawable.vatiyali, R.drawable.jari, R.drawable.sari,
            R.drawable.hason, R.drawable.nachiketa, R.drawable.hindi, R.drawable.english};

    public static ListView listViewmain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewmain = findViewById(R.id.lvmain);

        listViewmain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if (position == 0)

                {
                    Intent intent = new Intent(MainActivity.this, Nazrul.class);
                    startActivity(intent);
                }

                if (position == 1)

                {
                    Intent intent = new Intent(MainActivity.this, Rabindra.class);
                    startActivity(intent);
                }
                if (position == 2)

                {
                    Intent intent = new Intent(MainActivity.this, Desher.class);
                    startActivity(intent);
                }
                if (position == 3)

                {
                    Intent intent = new Intent(MainActivity.this, Adhunik.class);
                    startActivity(intent);
                }
                if (position == 4)

                {
                    Intent intent = new Intent(MainActivity.this, Classical.class);
                    startActivity(intent);
                }
                if (position == 5)

                {
                    Intent intent = new Intent(MainActivity.this, Baul.class);
                    startActivity(intent);
                }
                if (position == 6)

                {
                    Intent intent = new Intent(MainActivity.this, Lalon.class);
                    startActivity(intent);
                }
                if (position == 7)

                {
                    Intent intent = new Intent(MainActivity.this, Polligiti.class);
                    startActivity(intent);
                }
                if (position == 8)

                {
                    Intent intent = new Intent(MainActivity.this, Band.class);
                    startActivity(intent);
                }
                if (position == 9)

                {
                    Intent intent = new Intent(MainActivity.this, Bhawaiya.class);
                    startActivity(intent);
                }
                if (position == 10)

                {
                    Intent intent = new Intent(MainActivity.this, Bhatiyali.class);
                    startActivity(intent);
                }
                if (position == 11)

                {
                    Intent intent = new Intent(MainActivity.this, Jari.class);
                    startActivity(intent);
                }
                if (position == 12)

                {
                    Intent intent = new Intent(MainActivity.this, saree.class);
                    startActivity(intent);
                }
                if (position == 13)

                {
                    Intent intent = new Intent(MainActivity.this, Hason_Raza.class);
                    startActivity(intent);
                }
                if (position == 14)

                {
                    Intent intent = new Intent(MainActivity.this, Nachiketa.class);
                    startActivity(intent);
                }
                if (position == 15)

                {
                    Intent intent = new Intent(MainActivity.this, Hindi.class);
                    startActivity(intent);
                }
                if (position == 16)

                {
                    Intent intent = new Intent(MainActivity.this, English.class);
                    startActivity(intent);
                }

            }
        });


        CustomAdapter customAdapter = new CustomAdapter();
        listViewmain.setAdapter(customAdapter);

    }

    class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return Images.length;
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
          view = getLayoutInflater().inflate(R.layout.picture_layout, null);

            ImageView imageView = view.findViewById(R.id.pic);
            TextView textView_type = view.findViewById(R.id.tv1_songtype);

            imageView.setImageResource(Images[i]);
            textView_type.setText(songtype[i]);

            return view;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        MenuItem searchitem=menu.findItem(R.id.item_search);
        SearchView searchView=(SearchView) MenuItemCompat.getActionView(searchitem);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {


            @Override
            public boolean onQueryTextChange(String newText) {
                ArrayList<String> templist=new ArrayList<>();


                for (String temp:songtype){
                    if (temp.toLowerCase().contains(newText.toLowerCase())){
                        templist.add(temp);
                    }
                }

                ArrayAdapter<String>adapter=new ArrayAdapter<>(MainActivity.this,
                        android.R.layout.simple_list_item_1,templist);
                listViewmain.setAdapter(adapter);
                return true;
            }
            @Override
            public boolean onQueryTextSubmit(String guery) {
                return false;
            }

        });



        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            //   case R.id.prvs:
            //     onBackPressed();
            //   return true;

            //case R.id.next:
            //  onForwardPressed();
            //return true;

            case R.id.cont:
                Intent intent = new Intent(MainActivity.this, Contact.class);
                startActivity(intent);
                return true;


            case R.id.srch:
                //handleMenuSearch();
                Toast.makeText(this, "It's Now Developing Mode", Toast.LENGTH_SHORT).show();
                break;

            case R.id.shar:
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/pain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, myshare);
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Copied URL");
                startActivity(Intent.createChooser(shareIntent, "Share URL With Friends"));
                return true;

        }

         return super.onOptionsItemSelected(item);

    }
}


   // public void onForwardPressed(){
        //    Toast.makeText(this,"Can't go any further!",Toast.LENGTH_SHORT).show();
  //      }


   // public void onBackPressed() {
        //if (getClass(this.MainActivity).canGoBack()){
        //  this.CustomAdapter.goBack();
        // }
        //else {
      //  finish();



//    public void onForwardPressed(){
//        if (null.canGoForward()){
//            webView.goForward();
//        }
//        else {
//            Toast.makeText(this,"Can't go any further!",Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    public void onBackPressed(){
//        if (webView.canGoBack()){
//            webView.goBack();
//        }
//        else {
//            finish();
//        }
//
//
//    }
//
//}
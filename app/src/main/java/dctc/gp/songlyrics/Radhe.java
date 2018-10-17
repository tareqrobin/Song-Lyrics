package dctc.gp.songlyrics;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Radhe extends AppCompatActivity {


    MediaPlayer mediaPlayer;
    int PauseCurrentPosition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radhe);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater menuInflater = getMenuInflater();
            menuInflater.inflate(R.menu.music, menu);
            return super.onCreateOptionsMenu(menu);
        }

            @Override
            public boolean onOptionsItemSelected (MenuItem item) {
                switch (item.getItemId()) {


                    case R.id.play:
                        if (mediaPlayer == null) {
                  mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.radhe);
                        mediaPlayer.start();
                        } else if (!mediaPlayer.isPlaying()) {
                            mediaPlayer.seekTo(PauseCurrentPosition);
                            mediaPlayer.start();

                            }
                        return true;

                    case R.id.pause:
                        if (mediaPlayer != null) {
                            mediaPlayer.pause();
                            PauseCurrentPosition = mediaPlayer.getCurrentPosition();
                        }
                        break;


                    case R.id.stop:
                        if (mediaPlayer != null) {
                            mediaPlayer.stop();
                            mediaPlayer = null;
                        }
                        break;
                    case android.R.id.home:
                        onBackPressed();
                        return true;


                }
                return super.onOptionsItemSelected(item);

            }

            }

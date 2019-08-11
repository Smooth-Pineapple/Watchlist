package smoothpineapple.com.watchlist;

import androidx.appcompat.app.AppCompatActivity;
import smoothpineapple.com.watchlist.messaging.NotifyUser;

import android.content.Intent;
import android.os.Bundle;


public class MediaListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_list);

        Intent mediaListIntent = getIntent();
        NotifyUser.Snackbar(findViewById(R.id.mediaList), getLocalClassName() + ": " + "Not implemented", 0);
    }
}

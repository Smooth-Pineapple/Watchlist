package smoothpineapple.com.watchlist;

import androidx.appcompat.app.AppCompatActivity;
import smoothpineapple.com.watchlist.messaging.NotifyUser;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;


public class MediaListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_list);

        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        Intent mediaListIntent = getIntent();
        Bundle activityStartParams = mediaListIntent.getExtras();
        String activityName = null;
        if(activityStartParams != null) {
            activityName = mediaListIntent.getStringExtra(getResources().getString(R.string.media_activity_name));
            setTitle(activityName);
        }
        NotifyUser.Snackbar(findViewById(R.id.mediaList), activityName + ": " + "Not implemented", 0);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch(menuItem.getItemId()) {
            case android.R.id.home:
                Intent i = new Intent(this, CategoryMenuActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }
}

package smoothpineapple.com.watchlist;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AsyncStartUpDB setupDB = new AsyncStartUpDB();
        setupDB.execute("");
    }

    private class AsyncStartUpDB extends AsyncTask<String, Integer, Boolean> {
        private ProgressDialog m_progressView = null;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            m_progressView = new ProgressDialog(MainActivity.this);
            m_progressView.setMessage("DB initialisation");
            m_progressView.setIndeterminate(true);
            m_progressView.setCancelable(false);
            m_progressView.show();
        }

        @Override
        protected Boolean doInBackground(String... databaseBath) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... progress) {

        }
        @Override
        protected void onPostExecute(Boolean doesDBExist) {
            super.onPostExecute(doesDBExist);

            m_progressView.hide();
            Intent categoryIntent = new Intent(MainActivity.this, CategoryMenuActivity.class);
            startActivity(categoryIntent);
        }
    }
}
